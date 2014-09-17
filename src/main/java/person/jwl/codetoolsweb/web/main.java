package person.jwl.codetoolsweb.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import person.jwl.codetoolsweb.comm.JSONHelper;
import person.jwl.codetoolsweb.model.TemplateProject;
import person.jwl.codetoolsweb.service.intf.ITemplateProjectService;


@Controller
public class main {

	/**
	 * 日志
	 */
	static Logger logger = Logger.getLogger("mylog");
	
	/**
	 * 自动装配
	 */
	@Autowired
	@Qualifier("ITemplateProjectService")
	private ITemplateProjectService tpservice;
	
	@RequestMapping(value = "/test.json", method=RequestMethod.GET)
	public void test(HttpServletRequest request, HttpServletResponse response) throws Exception{
		response.setContentType("application/json;charset=UTF-8");
		
		for(int i = 0; i < 1; i++){
			TemplateProject obj = new TemplateProject();
			obj.setTpCreatetime(new Date().getTime());
			obj.setTpName("中文测试" + i);
			obj.setTpOutinfo("士大夫敢死队" + i);
			obj.setTpRemark("广泛士大夫" + i);
			//tpservice.Insert(obj);
		}
		
		List<TemplateProject> list = tpservice.FindAll();
		String json = JSONHelper.serialize(list);
		response.getWriter().write(json);
	}
	
}
