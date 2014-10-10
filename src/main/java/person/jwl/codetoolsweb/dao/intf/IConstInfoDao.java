package person.jwl.codetoolsweb.dao.intf;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.model.*;

/**
 *IConstInfoDao is the DAO interface for person.jwl.codetoolsweb.model.ConstInfo
 */
public interface IConstInfoDao {        

	/**
	 *Returns the total count of objects
	 */
	int GetCount() throws SQLException;

	/**
	 *Finds a ConstInfo instance by the primary key value
	 */
	ConstInfo Find(Long coiId) throws SQLException;

	/**
	 *Finds all ConstInfo instances.
	 */
	List<ConstInfo> FindAll() throws SQLException;
	
	/**
	 *Finds all ConstInfo instances without Lob columns loaded.
	 */
	List<ConstInfo> QuickFindAll() throws SQLException;
	
	/**
	 *Finds ConstInfo instances by CoiCode value.
	 */
	List<ConstInfo> FindByCoiCode(String coiCode) throws SQLException;
	
	/**
	 *Finds ConstInfo instances by CoiName value.
	 */
	List<ConstInfo> FindByCoiName(String coiName) throws SQLException;
	
	/**
	 *Finds ConstInfo instances by CoiRemark value.
	 */
	List<ConstInfo> FindByCoiRemark(String coiRemark) throws SQLException;
	
	/**
	 *Finds ConstInfo instances by CoiCreatetime value.
	 */
	List<ConstInfo> FindByCoiCreatetime(Long coiCreatetime) throws SQLException;
	
	/**
	 *Inserts a new ConstInfo instance into underlying database table.
	 */
	Long Insert(ConstInfo obj) throws SQLException;
	
	/**
	 *Update the underlying database record of a ConstInfo instance.
	 */
	int Update(ConstInfo obj) throws SQLException;
	
	/**
	 *Delete the underlying database record of a ConstInfo instance.
	 */
	int Delete(ConstInfo obj) throws SQLException;
	
    /**
	 *Deletes ConstInfo instances by ConstInfo.CoiCode.
	 */
	int DeleteByCoiCode(String coiCode) throws SQLException;
	
    /**
	 *Deletes ConstInfo instances by ConstInfo.CoiName.
	 */
	int DeleteByCoiName(String coiName) throws SQLException;
	
    /**
	 *Deletes ConstInfo instances by ConstInfo.CoiRemark.
	 */
	int DeleteByCoiRemark(String coiRemark) throws SQLException;
	
    /**
	 *Deletes ConstInfo instances by ConstInfo.CoiCreatetime.
	 */
	int DeleteByCoiCreatetime(Long coiCreatetime) throws SQLException;
	
	/**
	 *Reload the underlying database record of a ConstInfo instance.
	 */
	void Reload(ConstInfo obj) throws SQLException;
	
	List<ConstInforight> FindAllBytiId(Long tiId) throws SQLException;
	
}
