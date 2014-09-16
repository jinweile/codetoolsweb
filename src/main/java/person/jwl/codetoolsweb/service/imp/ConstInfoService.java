package person.jwl.codetoolsweb.service.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.dao.intf.IConstInfoDao;

import person.jwl.codetoolsweb.model.ConstInfo;
import person.jwl.codetoolsweb.service.intf.IConstInfoService;
	
/**
 *ConstInfoService is the implementation of IConstInfoService
 */
public class ConstInfoService implements IConstInfoService {
	
	private IConstInfoDao dao = null;
	
	/**
	 * dao interface
	 * @param dao
	 */
	public void setConstInfoDao(IConstInfoDao dao){
		this.dao = dao;
	}

	/**
	 *Implements IConstInfoService.GetCount
	 */
	public int GetCount() throws SQLException {
		int result = dao.GetCount();
		return result;
	}

	/**
	 *Implements IConstInfoService.Find
	 */
	public ConstInfo Find(Integer coiId) throws SQLException {
		ConstInfo result = dao.Find(coiId);
		return result;
	}

	/**
	 *Implements IConstInfoService.FindAll
	 */
	public List<ConstInfo> FindAll() throws SQLException {
		List<ConstInfo> result = dao.FindAll();
		return result;
	}
	
	/**
	 *Implements IConstInfoService.QuickFindAll
	 */
	public List<ConstInfo> QuickFindAll() throws SQLException {
		List<ConstInfo> result = dao.QuickFindAll();
		return result;
	}
	
	/**
	 *Implements IConstInfoService.FindByCoiCode
	 */
	public List<ConstInfo> FindByCoiCode(String coiCode) throws SQLException {
		List<ConstInfo> result = dao.FindByCoiCode(coiCode);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.FindByCoiName
	 */
	public List<ConstInfo> FindByCoiName(String coiName) throws SQLException {
		List<ConstInfo> result = dao.FindByCoiName(coiName);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.FindByCoiRemark
	 */
	public List<ConstInfo> FindByCoiRemark(String coiRemark) throws SQLException {
		List<ConstInfo> result = dao.FindByCoiRemark(coiRemark);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.FindByCoiCreatetime
	 */
	public List<ConstInfo> FindByCoiCreatetime(Date coiCreatetime) throws SQLException {
		List<ConstInfo> result = dao.FindByCoiCreatetime(coiCreatetime);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.Insert
	 */
	public Integer Insert(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Insert(obj);
	}
	
	/**
	 *Implements IConstInfoService.Update
	 */
	public int Update(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Update(obj);
	}
	
	/**
	 *Implements IConstInfoService.Delete
	 */
	public int Delete(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		return dao.Delete(obj);
	}
	
	/**
	 *Implements IConstInfoService.DeleteByCoiCode
	 */
	public int DeleteByCoiCode(String coiCode) throws SQLException {
		int result = dao.DeleteByCoiCode(coiCode);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.DeleteByCoiName
	 */
	public int DeleteByCoiName(String coiName) throws SQLException {
		int result = dao.DeleteByCoiName(coiName);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.DeleteByCoiRemark
	 */
	public int DeleteByCoiRemark(String coiRemark) throws SQLException {
		int result = dao.DeleteByCoiRemark(coiRemark);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.DeleteByCoiCreatetime
	 */
	public int DeleteByCoiCreatetime(Date coiCreatetime) throws SQLException {
		int result = dao.DeleteByCoiCreatetime(coiCreatetime);
		return result;
	}
	
	/**
	 *Implements IConstInfoService.Reload
	 */
	public void Reload(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		dao.Reload(obj);
	}
	
}
