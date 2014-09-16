package person.jwl.codetoolsweb.service.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.dao.intf.ITemplateProjectDao;

import person.jwl.codetoolsweb.model.TemplateProject;
import person.jwl.codetoolsweb.service.intf.ITemplateProjectService;
	
/**
 *TemplateProjectService is the implementation of ITemplateProjectService
 */
public class TemplateProjectService implements ITemplateProjectService {
	
	private ITemplateProjectDao dao = null;
	
	/**
	 * dao interface
	 * @param dao
	 */
	public void setTemplateProjectDao(ITemplateProjectDao dao){
		this.dao = dao;
	}

	/**
	 *Implements ITemplateProjectService.GetCount
	 */
	public int GetCount() throws SQLException {
		int result = dao.GetCount();
		return result;
	}

	/**
	 *Implements ITemplateProjectService.Find
	 */
	public TemplateProject Find(Integer tpId) throws SQLException {
		TemplateProject result = dao.Find(tpId);
		return result;
	}

	/**
	 *Implements ITemplateProjectService.QuickFind
	 */
	public TemplateProject QuickFind(Integer tpId) throws SQLException {
		TemplateProject result = dao.QuickFind(tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.FindAll
	 */
	public List<TemplateProject> FindAll() throws SQLException {
		List<TemplateProject> result = dao.FindAll();
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.QuickFindAll
	 */
	public List<TemplateProject> QuickFindAll() throws SQLException {
		List<TemplateProject> result = dao.QuickFindAll();
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.FindByTpName
	 */
	public List<TemplateProject> FindByTpName(String tpName) throws SQLException {
		List<TemplateProject> result = dao.FindByTpName(tpName);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.QuickFindByTpName
	 */
	public List<TemplateProject> QuickFindByTpName(String tpName) throws SQLException {
		List<TemplateProject> result = dao.QuickFindByTpName(tpName);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.FindByTpRemark
	 */
	public List<TemplateProject> FindByTpRemark(String tpRemark) throws SQLException {
		List<TemplateProject> result = dao.FindByTpRemark(tpRemark);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.QuickFindByTpRemark
	 */
	public List<TemplateProject> QuickFindByTpRemark(String tpRemark) throws SQLException {
		List<TemplateProject> result = dao.QuickFindByTpRemark(tpRemark);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.FindByTpCreatetime
	 */
	public List<TemplateProject> FindByTpCreatetime(Date tpCreatetime) throws SQLException {
		List<TemplateProject> result = dao.FindByTpCreatetime(tpCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.QuickFindByTpCreatetime
	 */
	public List<TemplateProject> QuickFindByTpCreatetime(Date tpCreatetime) throws SQLException {
		List<TemplateProject> result = dao.QuickFindByTpCreatetime(tpCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.Insert
	 */
	public Integer Insert(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Insert(obj);
	}
	
	/**
	 *Implements ITemplateProjectService.Update
	 */
	public int Update(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Update(obj);
	}
	
	/**
	 *Implements ITemplateProjectService.Delete
	 */
	public int Delete(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Delete(obj);
	}
	
	/**
	 *Implements ITemplateProjectService.DeleteByTpName
	 */
	public int DeleteByTpName(String tpName) throws SQLException {
		int result = dao.DeleteByTpName(tpName);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.DeleteByTpRemark
	 */
	public int DeleteByTpRemark(String tpRemark) throws SQLException {
		int result = dao.DeleteByTpRemark(tpRemark);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.DeleteByTpCreatetime
	 */
	public int DeleteByTpCreatetime(Date tpCreatetime) throws SQLException {
		int result = dao.DeleteByTpCreatetime(tpCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectService.Reload
	 */
	public void Reload(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		dao.Reload(obj);
	}
	
}
