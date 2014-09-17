package person.jwl.codetoolsweb.dao.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import com.ibatis.sqlmap.client.SqlMapClient;

import person.jwl.codetoolsweb.model.TemplateInfo;
import person.jwl.codetoolsweb.dao.intf.ITemplateInfoDao;
	
/**
 *TemplateInfoDao is the implementation of ITemplateInfoDao
 */
public class TemplateInfoDao implements ITemplateInfoDao {
	
	private SqlMapClient mapper = null;
	
	/**
	 * data map
	 * @param mapper
	 */
	public void setMapper(SqlMapClient mapper){
		this.mapper = mapper;
	}

	/**
	 *Implements ITemplateInfoDao.GetCount
	 */
	public int GetCount() throws SQLException {
		String stmtId = "TemplateInfo-GetCount";
		int result = (Integer)mapper.queryForObject(stmtId);
		return result;
	}

	/**
	 *Implements ITemplateInfoDao.Find
	 */
	public TemplateInfo Find(Long tiId) throws SQLException {
		String stmtId = "TemplateInfo-Find";
		TemplateInfo result = (TemplateInfo) mapper.queryForObject(stmtId, tiId);
		return result;
	}

	/**
	 *Implements ITemplateInfoDao.QuickFind
	 */
	public TemplateInfo QuickFind(Long tiId) throws SQLException {
		String stmtId = "TemplateInfo-QuickFind";
		TemplateInfo result = (TemplateInfo) mapper.queryForObject(stmtId, tiId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.FindAll
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> FindAll() throws SQLException {
		String stmtId = "TemplateInfo-FindAll";
		List<TemplateInfo> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.QuickFindAll
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> QuickFindAll() throws SQLException {
		String stmtId = "TemplateInfo-QuickFindAll";
		List<TemplateInfo> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.FindByTpId
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> FindByTpId(Long tpId) throws SQLException {
		String stmtId = "TemplateInfo-FindByTpId";
		List<TemplateInfo> result = mapper.queryForList(stmtId, tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.QuickFindByTpId
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> QuickFindByTpId(Long tpId) throws SQLException {
		String stmtId = "TemplateInfo-QuickFindByTpId";
		List<TemplateInfo> result = mapper.queryForList(stmtId, tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.FindByTiName
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> FindByTiName(String tiName) throws SQLException {
		String stmtId = "TemplateInfo-FindByTiName";
		List<TemplateInfo> result = mapper.queryForList(stmtId, tiName);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.QuickFindByTiName
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> QuickFindByTiName(String tiName) throws SQLException {
		String stmtId = "TemplateInfo-QuickFindByTiName";
		List<TemplateInfo> result = mapper.queryForList(stmtId, tiName);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.FindByTiCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> FindByTiCreatetime(Long tiCreatetime) throws SQLException {
		String stmtId = "TemplateInfo-FindByTiCreatetime";
		List<TemplateInfo> result = mapper.queryForList(stmtId, tiCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.QuickFindByTiCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateInfo> QuickFindByTiCreatetime(Long tiCreatetime) throws SQLException {
		String stmtId = "TemplateInfo-QuickFindByTiCreatetime";
		List<TemplateInfo> result = mapper.queryForList(stmtId, tiCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.Insert
	 */
	public Long Insert(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateInfo-Insert";
		return (Long) mapper.insert(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateInfoDao.Update
	 */
	public int Update(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateInfo-Update";
		return mapper.update(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateInfoDao.Delete
	 */
	public int Delete(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateInfo-Delete";
		return mapper.delete(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateInfoDao.DeleteByTpId
	 */
	public int DeleteByTpId(Long tpId) throws SQLException {
		String stmtId = "TemplateInfo-DeleteByTpId";
		int result = mapper.delete(stmtId, tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.DeleteByTiName
	 */
	public int DeleteByTiName(String tiName) throws SQLException {
		String stmtId = "TemplateInfo-DeleteByTiName";
		int result = mapper.delete(stmtId, tiName);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.DeleteByTiCreatetime
	 */
	public int DeleteByTiCreatetime(Long tiCreatetime) throws SQLException {
		String stmtId = "TemplateInfo-DeleteByTiCreatetime";
		int result = mapper.delete(stmtId, tiCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateInfoDao.Reload
	 */
	public void Reload(TemplateInfo obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateInfo-Find";
		mapper.queryForObject(stmtId, obj, obj);
	}
	
}
