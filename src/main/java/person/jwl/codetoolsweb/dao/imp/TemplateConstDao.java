package person.jwl.codetoolsweb.dao.imp;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import com.ibatis.sqlmap.client.SqlMapClient;

import person.jwl.codetoolsweb.model.TemplateConst;
import person.jwl.codetoolsweb.dao.intf.ITemplateConstDao;
	
/**
 *TemplateConstDao is the implementation of ITemplateConstDao
 */
public class TemplateConstDao implements ITemplateConstDao {
	
	private SqlMapClient mapper = null;
	
	/**
	 * data map
	 * @param mapper
	 */
	public void setMapper(SqlMapClient mapper){
		this.mapper = mapper;
	}

	/**
	 *Implements ITemplateConstDao.GetCount
	 */
	public int GetCount() throws SQLException {
		String stmtId = "TemplateConst-GetCount";
		int result = (Integer)mapper.queryForObject(stmtId);
		return result;
	}

	/**
	 *Implements ITemplateConstDao.Find
	 */
	public TemplateConst Find(Integer tcId) throws SQLException {
		String stmtId = "TemplateConst-Find";
		TemplateConst result = (TemplateConst) mapper.queryForObject(stmtId, tcId);
		return result;
	}

	/**
	 *Implements ITemplateConstDao.FindAll
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateConst> FindAll() throws SQLException {
		String stmtId = "TemplateConst-FindAll";
		List<TemplateConst> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements ITemplateConstDao.QuickFindAll
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateConst> QuickFindAll() throws SQLException {
		String stmtId = "TemplateConst-QuickFindAll";
		List<TemplateConst> result = mapper.queryForList(stmtId, null);
		return result;
	}
	
	/**
	 *Implements ITemplateConstDao.FindByTiId
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateConst> FindByTiId(Integer tiId) throws SQLException {
		String stmtId = "TemplateConst-FindByTiId";
		List<TemplateConst> result = mapper.queryForList(stmtId, tiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstDao.FindByCoiId
	 */
	@SuppressWarnings("unchecked")
	public List<TemplateConst> FindByCoiId(Integer coiId) throws SQLException {
		String stmtId = "TemplateConst-FindByCoiId";
		List<TemplateConst> result = mapper.queryForList(stmtId, coiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstDao.Insert
	 */
	public Integer Insert(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateConst-Insert";
		return (Integer) mapper.insert(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateConstDao.Update
	 */
	public int Update(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateConst-Update";
		return mapper.update(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateConstDao.Delete
	 */
	public int Delete(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateConst-Delete";
		return mapper.delete(stmtId, obj);
	}
	
	/**
	 *Implements ITemplateConstDao.DeleteByTiId
	 */
	public int DeleteByTiId(Integer tiId) throws SQLException {
		String stmtId = "TemplateConst-DeleteByTiId";
		int result = mapper.delete(stmtId, tiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstDao.DeleteByCoiId
	 */
	public int DeleteByCoiId(Integer coiId) throws SQLException {
		String stmtId = "TemplateConst-DeleteByCoiId";
		int result = mapper.delete(stmtId, coiId);
		return result;
	}
	
	/**
	 *Implements ITemplateConstDao.Reload
	 */
	public void Reload(TemplateConst obj) throws SQLException {
		if (obj == null) throw new NullPointerException("obj");
		String stmtId = "TemplateConst-Find";
		mapper.queryForObject(stmtId, obj, obj);
	}
	
}
