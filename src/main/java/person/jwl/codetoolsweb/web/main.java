package person.jwl.codetoolsweb.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import person.jwl.codetoolsweb.comm.JSONHelper;
import person.jwl.codetoolsweb.extjs.model.*;
import person.jwl.codetoolsweb.model.*;
import person.jwl.codetoolsweb.service.intf.*;


@Controller
public class main {

	/**
	 * 日志
	 */
	static Logger logger = Logger.getLogger("mylog");
	
	/**
	 * 项目
	 */
	@Autowired
	@Qualifier("ITemplateProjectService")
	private ITemplateProjectService tpservice;
	
	/**
	 * 模板
	 */
	@Autowired
	@Qualifier("ITemplateInfoService")
	private ITemplateInfoService tiservice;
	
	/**
	 * 加载首页
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		//model.addAllObjects(map);
		return model;
	}
	
	/**
	 * 获取项目目录树
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/projecttree.json", method=RequestMethod.GET)
	public void tree(HttpServletRequest request, HttpServletResponse response, 
			@RequestParam(required = false) String id) throws Exception{
		response.setContentType("application/json;charset=UTF-8");
		List<Tree> treelist = new ArrayList<Tree>();
		if(id == null || id.equals("src")){
			List<TemplateProject> tplist = tpservice.FindAll();
			for(TemplateProject tp : tplist){
				Tree tree = new Tree();
				tree.setCls("folder");
				tree.setId("src/" + tp.getTpId());
				//tree.setLeaf(true);
				tree.setText(tp.getTpName());
				treelist.add(tree);
			}
		}else{
			//获取项目下的模板信息
			Long TpId = Long.valueOf(id.split("/")[1]);
			List<TemplateInfo> tilist = tiservice.QuickFindByTpId(TpId);
			for(TemplateInfo ti : tilist){
				Tree titree = new Tree();
				titree.setCls("file");
				titree.setId("src/" + TpId + "/" + ti.getTiId());
				titree.setLeaf(true);
				titree.setText(ti.getTiName());
				treelist.add(titree);
			}
		}
		String json = JSONHelper.serialize(treelist);
		response.getWriter().write(json);
	}
	
	/**
	 * 获取项目目录树
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/project.json/{pid}", method=RequestMethod.GET)
	public void projectshow(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("pid") String pid) throws Exception{
		response.setContentType("application/json;charset=UTF-8");
		TemplateProject tp = tpservice.Find(Long.valueOf(pid == null ? "1" : pid));
		tp.setTpCreatetime(null);
		String json = JSONHelper.serialize(tp);
		response.getWriter().write(json);
	}
	
	/**
	 * 编辑项目
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/project.json", method=RequestMethod.POST)
	public void projectedit(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required = true) Long tpId,
			@RequestParam(required = true) String tpName,
			@RequestParam(required = true) String tpRemark,
			@RequestParam(required = true) String tpOutinfo) throws Exception{
		response.setContentType("application/json;charset=UTF-8");
		TemplateProject tp = new TemplateProject();
		tp.setTpCreatetime(new Date().getTime());
		tp.setTpId(tpId);
		tp.setTpName(tpName);
		tp.setTpRemark(tpRemark);
		tp.setTpOutinfo(tpOutinfo);
		if(tp.getTpId().equals(0)){
			tpservice.Insert(tp);
		}else{
			tpservice.Update(tp);
		}
		response.getWriter().write("{\"success\":true}");
	}
	
}
