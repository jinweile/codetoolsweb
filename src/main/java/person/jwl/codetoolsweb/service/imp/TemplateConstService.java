package person.jwl.codetoolsweb.service.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.dao.intf.ITemplateConstDao;

import person.jwl.codetoolsweb.model.TemplateConst;
import person.jwl.codetoolsweb.service.intf.ITemplateConstService;
	
/**
 *TemplateConstService is the implementation of ITemplateConstService
 */
public class TemplateConstService implements ITemplateConstService {
	
	private ITemplateConstDao dao = null;
	
	/**
	 * dao interface
	 * @param dao
	 */
	public void setTemplateConstDao(ITemplateConstDao dao){
		this.dao = dao;
	}

	/**
	 *Implements ITemplateConstService.GetCount
	 */
	public int GetCount() throws SQLException {
		int result = dao.GetCount();
		return result;
	}

	/**
	 *Implements ITemplateConstService.Find
	 */
	public TemplateConst Find(Integer tcId) throws SQLException {
		TemplateConst result = dao.Find(tcId);
		return result;
	}

	/**
	 *Implements ITemplateConstService.FindAll
	 */
	public List<TemplateConst> FindAll() throws SQLException {
		List<TemplateConst> result = dao.FindAll();
		return result;
	}
	
	/**
	 *Implements ITemplateConstService.QuickFindAll
	 */
	public List<TemplateConst> QuickFindAll() throws SQLException {
		List<TemplateConst> result = dao.QuickFindAll();
		return result;
	}
	
	/**
	 *Implements ITemplateConstService.FindByTiId
	 */
	public List<TemplateConst> FindByTiId(Integer tiId) throws SQLException {
		List<TemplateConst> result = dao.FindByTiId(tiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstService.FindByCoiId
	 */
	public List<TemplateConst> FindByCoiId(Integer coiId) throws SQLException {
		List<TemplateConst> result = dao.FindByCoiId(coiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstService.Insert
	 */
	public Integer Insert(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Insert(obj);
	}
	
	/**
	 *Implements ITemplateConstService.Update
	 */
	public int Update(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Update(obj);
	}
	
	/**
	 *Implements ITemplateConstService.Delete
	 */
	public int Delete(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Delete(obj);
	}
	
	/**
	 *Implements ITemplateConstService.DeleteByTiId
	 */
	public int DeleteByTiId(Integer tiId) throws SQLException {
		int result = dao.DeleteByTiId(tiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstService.DeleteByCoiId
	 */
	public int DeleteByCoiId(Integer coiId) throws SQLException {
		int result = dao.DeleteByCoiId(coiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstService.Reload
	 */
	public void Reload(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		dao.Reload(obj);
	}
	
}
