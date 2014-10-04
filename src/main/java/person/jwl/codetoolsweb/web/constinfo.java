package person.jwl.codetoolsweb.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import person.jwl.codetoolsweb.comm.JSONHelper;
import person.jwl.codetoolsweb.extjs.model.*;
import person.jwl.codetoolsweb.model.*;
import person.jwl.codetoolsweb.service.intf.*;

@Controller
public class constinfo {

	/**
	 * 日志
	 */
	static Logger logger = Logger.getLogger("mylog");
	
	@Autowired
	@Qualifier("IConstInfoService")
	private IConstInfoService ciservice;
	
	/**
	 * 常量列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/constlist.json", method=RequestMethod.GET)
	public void constlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<ConstInfo> list = ciservice.FindAll();
		Grid<ConstInfo> grid = new Grid<ConstInfo>();
		grid.setItems(list);
		response.setContentType("application/json;charset=UTF-8");
		String json = JSONHelper.serialize(grid);
		response.getWriter().write(json);
	}
	
	/**
	 * 编辑常量
	 * @param request
	 * @param response
	 * @param coiId
	 * @param coiName
	 * @param coiCode
	 * @throws Exception
	 */
	@RequestMapping(value = "/constinfoedit.json", method=RequestMethod.POST)
	public void constinfoedit(HttpServletRequest request, 
			HttpServletResponse response,
			@RequestParam(required = false) Long coiId,
			@RequestParam(required = false) String coiName,
			@RequestParam(required = false) String coiCode) throws Exception{
		ConstInfo obj = new ConstInfo();
		obj.setCoiId(coiId);
		obj.setCoiName(coiName);
		obj.setCoiCode(coiCode);
		if(obj.getCoiId().equals(Long.valueOf(0))){
			ciservice.Insert(obj);
		}else{
			ciservice.Update(obj);
		}
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write("{\"success\":true}");
	}
	
	/**
	 * 删除常量
	 * @param request
	 * @param response
	 * @param coiId
	 * @throws Exception
	 */
	@RequestMapping(value = "/constinfodel.json", method=RequestMethod.POST)
	public void constinfodel(HttpServletRequest request, 
			HttpServletResponse response,
			@RequestParam(required = false) Long coiId) throws Exception{
		ConstInfo obj = new ConstInfo();
		obj.setCoiId(coiId);
		ciservice.Delete(obj);
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write("{\"success\":true}");
	}
	
}
