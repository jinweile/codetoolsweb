package person.jwl.codetoolsweb.service.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.dao.intf.ITemplateInfoDao;

import person.jwl.codetoolsweb.model.TemplateInfo;
import person.jwl.codetoolsweb.service.intf.ITemplateInfoService;
	
/**
 *TemplateInfoService is the implementation of ITemplateInfoService
 */
public class TemplateInfoService implements ITemplateInfoService {
	
	private ITemplateInfoDao dao = null;
	
	/**
	 * dao interface
	 * @param dao
	 */
	public void setTemplateInfoDao(ITemplateInfoDao dao){
		this.dao = dao;
	}

	/**
	 *Implements ITemplateInfoService.GetCount
	 */
	public int GetCount() throws SQLException {
		int result = dao.GetCount();
		return result;
	}

	/**
	 *Implements ITemplateInfoService.Find
	 */
	public TemplateInfo Find(Long tiId) throws SQLException {
		TemplateInfo result = dao.Find(tiId);
		return result;
	}

	/**
	 *Implements ITemplateInfoService.QuickFind
	 */
	public TemplateInfo QuickFind(Long tiId) throws SQLException {
		TemplateInfo result = dao.QuickFind(tiId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.FindAll
	 */
	public List<TemplateInfo> FindAll() throws SQLException {
		List<TemplateInfo> result = dao.FindAll();
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.QuickFindAll
	 */
	public List<TemplateInfo> QuickFindAll() throws SQLException {
		List<TemplateInfo> result = dao.QuickFindAll();
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.FindByTpId
	 */
	public List<TemplateInfo> FindByTpId(Long tpId) throws SQLException {
		List<TemplateInfo> result = dao.FindByTpId(tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.QuickFindByTpId
	 */
	public List<TemplateInfo> QuickFindByTpId(Long tpId) throws SQLException {
		List<TemplateInfo> result = dao.QuickFindByTpId(tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.FindByTiName
	 */
	public List<TemplateInfo> FindByTiName(String tiName) throws SQLException {
		List<TemplateInfo> result = dao.FindByTiName(tiName);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.QuickFindByTiName
	 */
	public List<TemplateInfo> QuickFindByTiName(String tiName) throws SQLException {
		List<TemplateInfo> result = dao.QuickFindByTiName(tiName);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.FindByTiCreatetime
	 */
	public List<TemplateInfo> FindByTiCreatetime(Long tiCreatetime) throws SQLException {
		List<TemplateInfo> result = dao.FindByTiCreatetime(tiCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.QuickFindByTiCreatetime
	 */
	public List<TemplateInfo> QuickFindByTiCreatetime(Long tiCreatetime) throws SQLException {
		List<TemplateInfo> result = dao.QuickFindByTiCreatetime(tiCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.Insert
	 */
	public Long Insert(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Insert(obj);
	}
	
	/**
	 *Implements ITemplateInfoService.Update
	 */
	public int Update(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Update(obj);
	}
	
	/**
	 *Implements ITemplateInfoService.Delete
	 */
	public int Delete(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Delete(obj);
	}
	
	/**
	 *Implements ITemplateInfoService.DeleteByTpId
	 */
	public int DeleteByTpId(Long tpId) throws SQLException {
		int result = dao.DeleteByTpId(tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.DeleteByTiName
	 */
	public int DeleteByTiName(String tiName) throws SQLException {
		int result = dao.DeleteByTiName(tiName);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.DeleteByTiCreatetime
	 */
	public int DeleteByTiCreatetime(Long tiCreatetime) throws SQLException {
		int result = dao.DeleteByTiCreatetime(tiCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoService.Reload
	 */
	public void Reload(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		dao.Reload(obj);
	}
	
}
