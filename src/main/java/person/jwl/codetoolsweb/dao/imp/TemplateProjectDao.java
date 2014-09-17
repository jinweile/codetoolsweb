package person.jwl.codetoolsweb.dao.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import com.ibatis.sqlmap.client.SqlMapClient;

import person.jwl.codetoolsweb.model.TemplateProject;
import person.jwl.codetoolsweb.dao.intf.ITemplateProjectDao;
	
/**
 *TemplateProjectDao is the implementation of ITemplateProjectDao
 */
public class TemplateProjectDao implements ITemplateProjectDao {
	
	private SqlMapClient mapper = null;
	
	/**
	 * data map
	 * @param mapper
	 */
	public void setMapper(SqlMapClient mapper){
		this.mapper = mapper;
	}

	/**
	 *Implements ITemplateProjectDao.GetCount
	 */
	public int GetCount() throws SQLException {
		String stmtId = "TemplateProject-GetCount";
		int result = (Integer)mapper.queryForObject(stmtId);
		return result;
	}

	/**
	 *Implements ITemplateProjectDao.Find
	 */
	public TemplateProject Find(Long tpId) throws SQLException {
		String stmtId = "TemplateProject-Find";
		TemplateProject result = (TemplateProject) mapper.queryForObject(stmtId, tpId);
		return result;
	}

	/**
	 *Implements ITemplateProjectDao.QuickFind
	 */
	public TemplateProject QuickFind(Long tpId) throws SQLException {
		String stmtId = "TemplateProject-QuickFind";
		TemplateProject result = (TemplateProject) mapper.queryForObject(stmtId, tpId);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.FindAll
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> FindAll() throws SQLException {
		String stmtId = "TemplateProject-FindAll";
		List<TemplateProject> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.QuickFindAll
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> QuickFindAll() throws SQLException {
		String stmtId = "TemplateProject-QuickFindAll";
		List<TemplateProject> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.FindByTpName
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> FindByTpName(String tpName) throws SQLException {
		String stmtId = "TemplateProject-FindByTpName";
		List<TemplateProject> result = mapper.queryForList(stmtId, tpName);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.QuickFindByTpName
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> QuickFindByTpName(String tpName) throws SQLException {
		String stmtId = "TemplateProject-QuickFindByTpName";
		List<TemplateProject> result = mapper.queryForList(stmtId, tpName);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.FindByTpRemark
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> FindByTpRemark(String tpRemark) throws SQLException {
		String stmtId = "TemplateProject-FindByTpRemark";
		List<TemplateProject> result = mapper.queryForList(stmtId, tpRemark);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.QuickFindByTpRemark
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> QuickFindByTpRemark(String tpRemark) throws SQLException {
		String stmtId = "TemplateProject-QuickFindByTpRemark";
		List<TemplateProject> result = mapper.queryForList(stmtId, tpRemark);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.FindByTpCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> FindByTpCreatetime(Long tpCreatetime) throws SQLException {
		String stmtId = "TemplateProject-FindByTpCreatetime";
		List<TemplateProject> result = mapper.queryForList(stmtId, tpCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.QuickFindByTpCreatetime
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateProject> QuickFindByTpCreatetime(Long tpCreatetime) throws SQLException {
		String stmtId = "TemplateProject-QuickFindByTpCreatetime";
		List<TemplateProject> result = mapper.queryForList(stmtId, tpCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.Insert
	 */
	public Long Insert(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateProject-Insert";
		return (Long) mapper.insert(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateProjectDao.Update
	 */
	public int Update(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateProject-Update";
		return mapper.update(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateProjectDao.Delete
	 */
	public int Delete(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateProject-Delete";
		return mapper.delete(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateProjectDao.DeleteByTpName
	 */
	public int DeleteByTpName(String tpName) throws SQLException {
		String stmtId = "TemplateProject-DeleteByTpName";
		int result = mapper.delete(stmtId, tpName);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.DeleteByTpRemark
	 */
	public int DeleteByTpRemark(String tpRemark) throws SQLException {
		String stmtId = "TemplateProject-DeleteByTpRemark";
		int result = mapper.delete(stmtId, tpRemark);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.DeleteByTpCreatetime
	 */
	public int DeleteByTpCreatetime(Long tpCreatetime) throws SQLException {
		String stmtId = "TemplateProject-DeleteByTpCreatetime";
		int result = mapper.delete(stmtId, tpCreatetime);
		return result;
	}
	
	/**
	 *Implements ITemplateProjectDao.Reload
	 */
	public void Reload(TemplateProject obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateProject-Find";
		mapper.queryForObject(stmtId, obj, obj);
	}
	
}
