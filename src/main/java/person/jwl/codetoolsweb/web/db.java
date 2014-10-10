package person.jwl.codetoolsweb.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import person.jwl.codetoolsweb.comm.JSONHelper;
import person.jwl.codetoolsweb.extjs.model.*;
import person.jwl.codetoolsweb.model.*;
import person.jwl.codetoolsweb.service.intf.*;

@Controller
public class db {
	
	/**
	 * 日志
	 */
	static Logger logger = Logger.getLogger("mylog");
	
	@Autowired
	@Qualifier("IDbInfoService")
	private IDbInfoService dbservice;
	
	/**
	 * 数据库列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/dblist.json", method=RequestMethod.GET)
	public void dblist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<DbInfo> list = dbservice.FindAll();
		Grid<DbInfo> grid = new Grid<DbInfo>();
		grid.setItems(list);
		response.setContentType("application/json;charset=UTF-8");
		String json = JSONHelper.serialize(grid);
		response.getWriter().write(json);
	}
	
	/**
	 * 删除数据库信息
	 * @param request
	 * @param response
	 * @param coiId
	 * @throws Exception
	 */
	@RequestMapping(value = "/dbdel.json", method=RequestMethod.POST)
	public void dbdel(HttpServletRequest request, 
			HttpServletResponse response,
			@RequestParam(required = false) Long diId) throws Exception{
		DbInfo obj = new DbInfo();
		obj.setDiId(diId);
		dbservice.Delete(obj);
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write("{\"success\":true}");
	}
	
	/**
	 * 获取数据库信息
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/db.json/{diId}", method=RequestMethod.GET)
	public void dbshow(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("diId") String diId) throws Exception{
		response.setContentType("application/json;charset=UTF-8");
		DbInfo obj = dbservice.Find(Long.valueOf(diId == null ? "0" : diId));
		obj.setDiCreatetime(null);
		String json = JSONHelper.serialize(obj);
		response.getWriter().write(json);
	}
	
	/**
	 * 编辑数据库信息
	 * @param request
	 * @param response
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "/dbedit.json", method=RequestMethod.POST)
	public void dbedit(HttpServletRequest request, HttpServletResponse response,
			DbInfo obj) throws Exception{
		response.setContentType("application/json;charset=UTF-8");
		if(obj.getDiId() == null || obj.getDiId().equals(Long.valueOf(0))){
			dbservice.Insert(obj);
		}else{
			dbservice.Update(obj);
		}
		response.getWriter().write("{\"success\":true}");
	}

}
