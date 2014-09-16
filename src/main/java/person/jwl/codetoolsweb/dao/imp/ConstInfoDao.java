package person.jwl.codetoolsweb.dao.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import com.ibatis.sqlmap.client.SqlMapClient;

import person.jwl.codetoolsweb.model.ConstInfo;
import person.jwl.codetoolsweb.dao.intf.IConstInfoDao;
	
/**
 *ConstInfoDao is the implementation of IConstInfoDao
 */
public class ConstInfoDao implements IConstInfoDao {
	
	private SqlMapClient mapper = null;
	
	/**
	 * data map
	 * @param mapper
	 */
	public void setMapper(SqlMapClient mapper){
		this.mapper = mapper;
	}

	/**
	 *Implements IConstInfoDao.GetCount
	 */
	public int GetCount() throws SQLException {
		String stmtId = "ConstInfo-GetCount";
		int result = (Integer)mapper.queryForObject(stmtId);
		return result;
	}

	/**
	 *Implements IConstInfoDao.Find
	 */
	public ConstInfo Find(Integer coiId) throws SQLException {
		String stmtId = "ConstInfo-Find";
		ConstInfo result = (ConstInfo) mapper.queryForObject(stmtId, coiId);
		return result;
	}

	/**
	 *Implements IConstInfoDao.FindAll
	 */
	@SuppressWarnings("unchecked")
	public List<ConstInfo> FindAll() throws SQLException {
		String stmtId = "ConstInfo-FindAll";
		List<ConstInfo> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.QuickFindAll
	 */
	@SuppressWarnings("unchecked")
	public List<ConstInfo> QuickFindAll() throws SQLException {
		String stmtId = "ConstInfo-QuickFindAll";
		List<ConstInfo> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.FindByCoiCode
	 */
	@SuppressWarnings("unchecked")
	public List<ConstInfo> FindByCoiCode(String coiCode) throws SQLException {
		String stmtId = "ConstInfo-FindByCoiCode";
		List<ConstInfo> result = mapper.queryForList(stmtId, coiCode);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.FindByCoiName
	 */
	@SuppressWarnings("unchecked")
	public List<ConstInfo> FindByCoiName(String coiName) throws SQLException {
		String stmtId = "ConstInfo-FindByCoiName";
		List<ConstInfo> result = mapper.queryForList(stmtId, coiName);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.FindByCoiRemark
	 */
	@SuppressWarnings("unchecked")
	public List<ConstInfo> FindByCoiRemark(String coiRemark) throws SQLException {
		String stmtId = "ConstInfo-FindByCoiRemark";
		List<ConstInfo> result = mapper.queryForList(stmtId, coiRemark);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.FindByCoiCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<ConstInfo> FindByCoiCreatetime(Date coiCreatetime) throws SQLException {
		String stmtId = "ConstInfo-FindByCoiCreatetime";
		List<ConstInfo> result = mapper.queryForList(stmtId, coiCreatetime);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.Insert
	 */
	public Integer Insert(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "ConstInfo-Insert";
		return (Integer) mapper.insert(stmtId, obj);
	}
	
	/**
	 *Implements IConstInfoDao.Update
	 */
	public int Update(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "ConstInfo-Update";
		return mapper.update(stmtId, obj);
	}
	
	/**
	 *Implements IConstInfoDao.Delete
	 */
	public int Delete(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "ConstInfo-Delete";
		return mapper.delete(stmtId, obj);
	}
	
	/**
	 *Implements IConstInfoDao.DeleteByCoiCode
	 */
	public int DeleteByCoiCode(String coiCode) throws SQLException {
		String stmtId = "ConstInfo-DeleteByCoiCode";
		int result = mapper.delete(stmtId, coiCode);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.DeleteByCoiName
	 */
	public int DeleteByCoiName(String coiName) throws SQLException {
		String stmtId = "ConstInfo-DeleteByCoiName";
		int result = mapper.delete(stmtId, coiName);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.DeleteByCoiRemark
	 */
	public int DeleteByCoiRemark(String coiRemark) throws SQLException {
		String stmtId = "ConstInfo-DeleteByCoiRemark";
		int result = mapper.delete(stmtId, coiRemark);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.DeleteByCoiCreatetime
	 */
	public int DeleteByCoiCreatetime(Date coiCreatetime) throws SQLException {
		String stmtId = "ConstInfo-DeleteByCoiCreatetime";
		int result = mapper.delete(stmtId, coiCreatetime);
		return result;
	}
	
	/**
	 *Implements IConstInfoDao.Reload
	 */
	public void Reload(ConstInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "ConstInfo-Find";
		mapper.queryForObject(stmtId, obj, obj);
	}
	
}
