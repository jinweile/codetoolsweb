package person.jwl.codetoolsweb.dao.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import com.ibatis.sqlmap.client.SqlMapClient;

import person.jwl.codetoolsweb.model.DbInfo;
import person.jwl.codetoolsweb.dao.intf.IDbInfoDao;
	
/**
 *DbInfoDao is the implementation of IDbInfoDao
 */
public class DbInfoDao implements IDbInfoDao {
	
	private SqlMapClient mapper = null;
	
	/**
	 * data map
	 * @param mapper
	 */
	public void setMapper(SqlMapClient mapper){
		this.mapper = mapper;
	}

	/**
	 *Implements IDbInfoDao.GetCount
	 */
	public int GetCount() throws SQLException {
		String stmtId = "DbInfo-GetCount";
		int result = (Integer)mapper.queryForObject(stmtId);
		return result;
	}

	/**
	 *Implements IDbInfoDao.Find
	 */
	public DbInfo Find(Integer diId) throws SQLException {
		String stmtId = "DbInfo-Find";
		DbInfo result = (DbInfo) mapper.queryForObject(stmtId, diId);
		return result;
	}

	/**
	 *Implements IDbInfoDao.QuickFind
	 */
	public DbInfo QuickFind(Integer diId) throws SQLException {
		String stmtId = "DbInfo-QuickFind";
		DbInfo result = (DbInfo) mapper.queryForObject(stmtId, diId);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.FindAll
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> FindAll() throws SQLException {
		String stmtId = "DbInfo-FindAll";
		List<DbInfo> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.QuickFindAll
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> QuickFindAll() throws SQLException {
		String stmtId = "DbInfo-QuickFindAll";
		List<DbInfo> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.FindByDiName
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> FindByDiName(String diName) throws SQLException {
		String stmtId = "DbInfo-FindByDiName";
		List<DbInfo> result = mapper.queryForList(stmtId, diName);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.QuickFindByDiName
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> QuickFindByDiName(String diName) throws SQLException {
		String stmtId = "DbInfo-QuickFindByDiName";
		List<DbInfo> result = mapper.queryForList(stmtId, diName);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.FindByDiClassname
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> FindByDiClassname(String diClassname) throws SQLException {
		String stmtId = "DbInfo-FindByDiClassname";
		List<DbInfo> result = mapper.queryForList(stmtId, diClassname);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.QuickFindByDiClassname
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> QuickFindByDiClassname(String diClassname) throws SQLException {
		String stmtId = "DbInfo-QuickFindByDiClassname";
		List<DbInfo> result = mapper.queryForList(stmtId, diClassname);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.FindByDiLinks
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> FindByDiLinks(String diLinks) throws SQLException {
		String stmtId = "DbInfo-FindByDiLinks";
		List<DbInfo> result = mapper.queryForList(stmtId, diLinks);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.QuickFindByDiLinks
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> QuickFindByDiLinks(String diLinks) throws SQLException {
		String stmtId = "DbInfo-QuickFindByDiLinks";
		List<DbInfo> result = mapper.queryForList(stmtId, diLinks);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.FindByDiCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> FindByDiCreatetime(Date diCreatetime) throws SQLException {
		String stmtId = "DbInfo-FindByDiCreatetime";
		List<DbInfo> result = mapper.queryForList(stmtId, diCreatetime);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.QuickFindByDiCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<DbInfo> QuickFindByDiCreatetime(Date diCreatetime) throws SQLException {
		String stmtId = "DbInfo-QuickFindByDiCreatetime";
		List<DbInfo> result = mapper.queryForList(stmtId, diCreatetime);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.Insert
	 */
	public Integer Insert(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "DbInfo-Insert";
		return (Integer) mapper.insert(stmtId, obj);
	}
	
	/**
	 *Implements IDbInfoDao.Update
	 */
	public int Update(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "DbInfo-Update";
		return mapper.update(stmtId, obj);
	}
	
	/**
	 *Implements IDbInfoDao.Delete
	 */
	public int Delete(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "DbInfo-Delete";
		return mapper.delete(stmtId, obj);
	}
	
	/**
	 *Implements IDbInfoDao.DeleteByDiName
	 */
	public int DeleteByDiName(String diName) throws SQLException {
		String stmtId = "DbInfo-DeleteByDiName";
		int result = mapper.delete(stmtId, diName);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.DeleteByDiClassname
	 */
	public int DeleteByDiClassname(String diClassname) throws SQLException {
		String stmtId = "DbInfo-DeleteByDiClassname";
		int result = mapper.delete(stmtId, diClassname);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.DeleteByDiLinks
	 */
	public int DeleteByDiLinks(String diLinks) throws SQLException {
		String stmtId = "DbInfo-DeleteByDiLinks";
		int result = mapper.delete(stmtId, diLinks);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.DeleteByDiCreatetime
	 */
	public int DeleteByDiCreatetime(Date diCreatetime) throws SQLException {
		String stmtId = "DbInfo-DeleteByDiCreatetime";
		int result = mapper.delete(stmtId, diCreatetime);
		return result;
	}
	
	/**
	 *Implements IDbInfoDao.Reload
	 */
	public void Reload(DbInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "DbInfo-Find";
		mapper.queryForObject(stmtId, obj, obj);
	}
	
}
