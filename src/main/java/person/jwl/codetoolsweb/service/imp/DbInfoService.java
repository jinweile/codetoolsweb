package person.jwl.codetoolsweb.service.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.dao.intf.IDbInfoDao;

import person.jwl.codetoolsweb.model.DbInfo;
import person.jwl.codetoolsweb.service.intf.IDbInfoService;
	
/**
 *DbInfoService is the implementation of IDbInfoService
 */
public class DbInfoService implements IDbInfoService {
	
	private IDbInfoDao dao = null;
	
	/**
	 * dao interface
	 * @param dao
	 */
	public void setDbInfoDao(IDbInfoDao dao){
		this.dao = dao;
	}

	/**
	 *Implements IDbInfoService.GetCount
	 */
	public int GetCount() throws SQLException {
		int result = dao.GetCount();
		return result;
	}

	/**
	 *Implements IDbInfoService.Find
	 */
	public DbInfo Find(Integer diId) throws SQLException {
		DbInfo result = dao.Find(diId);
		return result;
	}

	/**
	 *Implements IDbInfoService.QuickFind
	 */
	public DbInfo QuickFind(Integer diId) throws SQLException {
		DbInfo result = dao.QuickFind(diId);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.FindAll
	 */
	public List<DbInfo> FindAll() throws SQLException {
		List<DbInfo> result = dao.FindAll();
		return result;
	}
	
	/**
	 *Implements IDbInfoService.QuickFindAll
	 */
	public List<DbInfo> QuickFindAll() throws SQLException {
		List<DbInfo> result = dao.QuickFindAll();
		return result;
	}
	
	/**
	 *Implements IDbInfoService.FindByDiName
	 */
	public List<DbInfo> FindByDiName(String diName) throws SQLException {
		List<DbInfo> result = dao.FindByDiName(diName);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.QuickFindByDiName
	 */
	public List<DbInfo> QuickFindByDiName(String diName) throws SQLException {
		List<DbInfo> result = dao.QuickFindByDiName(diName);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.FindByDiClassname
	 */
	public List<DbInfo> FindByDiClassname(String diClassname) throws SQLException {
		List<DbInfo> result = dao.FindByDiClassname(diClassname);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.QuickFindByDiClassname
	 */
	public List<DbInfo> QuickFindByDiClassname(String diClassname) throws SQLException {
		List<DbInfo> result = dao.QuickFindByDiClassname(diClassname);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.FindByDiLinks
	 */
	public List<DbInfo> FindByDiLinks(String diLinks) throws SQLException {
		List<DbInfo> result = dao.FindByDiLinks(diLinks);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.QuickFindByDiLinks
	 */
	public List<DbInfo> QuickFindByDiLinks(String diLinks) throws SQLException {
		List<DbInfo> result = dao.QuickFindByDiLinks(diLinks);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.FindByDiCreatetime
	 */
	public List<DbInfo> FindByDiCreatetime(Date diCreatetime) throws SQLException {
		List<DbInfo> result = dao.FindByDiCreatetime(diCreatetime);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.QuickFindByDiCreatetime
	 */
	public List<DbInfo> QuickFindByDiCreatetime(Date diCreatetime) throws SQLException {
		List<DbInfo> result = dao.QuickFindByDiCreatetime(diCreatetime);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.Insert
	 */
	public Integer Insert(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Insert(obj);
	}
	
	/**
	 *Implements IDbInfoService.Update
	 */
	public int Update(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Update(obj);
	}
	
	/**
	 *Implements IDbInfoService.Delete
	 */
	public int Delete(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Delete(obj);
	}
	
	/**
	 *Implements IDbInfoService.DeleteByDiName
	 */
	public int DeleteByDiName(String diName) throws SQLException {
		int result = dao.DeleteByDiName(diName);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.DeleteByDiClassname
	 */
	public int DeleteByDiClassname(String diClassname) throws SQLException {
		int result = dao.DeleteByDiClassname(diClassname);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.DeleteByDiLinks
	 */
	public int DeleteByDiLinks(String diLinks) throws SQLException {
		int result = dao.DeleteByDiLinks(diLinks);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.DeleteByDiCreatetime
	 */
	public int DeleteByDiCreatetime(Date diCreatetime) throws SQLException {
		int result = dao.DeleteByDiCreatetime(diCreatetime);
		return result;
	}
	
	/**
	 *Implements IDbInfoService.Reload
	 */
	public void Reload(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		dao.Reload(obj);
	}
	
}
