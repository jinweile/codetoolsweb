package person.jwl.codetoolsweb.service.intf;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.model.*;

/**
 *IDbInfoService is the Service interface for person.jwl.codetoolsweb.model.DbInfo
 */
public interface IDbInfoService {        

	/**
	 *Returns the total count of objects
	 */
	int GetCount() throws SQLException;

	/**
	 *Finds a DbInfo instance by the primary key value
	 */
	DbInfo Find(Long diId) throws SQLException;

	/**
	 *Finds a DbInfo instance by the primary key value without Lob columns loaded
	 */
	DbInfo QuickFind(Long diId) throws SQLException;
	
	/**
	 *Finds all DbInfo instances.
	 */
	List<DbInfo> FindAll() throws SQLException;
	
	/**
	 *Finds all DbInfo instances without Lob columns loaded.
	 */
	List<DbInfo> QuickFindAll() throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiName value.
	 */
	List<DbInfo> FindByDiName(String diName) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiName value without Lob columns loaded.
	 */
	List<DbInfo> QuickFindByDiName(String diName) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiClassname value.
	 */
	List<DbInfo> FindByDiClassname(String diClassname) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiClassname value without Lob columns loaded.
	 */
	List<DbInfo> QuickFindByDiClassname(String diClassname) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiLinks value.
	 */
	List<DbInfo> FindByDiLinks(String diLinks) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiLinks value without Lob columns loaded.
	 */
	List<DbInfo> QuickFindByDiLinks(String diLinks) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiCreatetime value.
	 */
	List<DbInfo> FindByDiCreatetime(Long diCreatetime) throws SQLException;
	
	/**
	 *Finds DbInfo instances by DiCreatetime value without Lob columns loaded.
	 */
	List<DbInfo> QuickFindByDiCreatetime(Long diCreatetime) throws SQLException;
	
	/**
	 *Inserts a new DbInfo instance into underlying database table.
	 */
	Long Insert(DbInfo obj) throws SQLException;
	
	/**
	 *Update the underlying database record of a DbInfo instance.
	 */
	int Update(DbInfo obj) throws SQLException;
	
	/**
	 *Delete the underlying database record of a DbInfo instance.
	 */
	int Delete(DbInfo obj) throws SQLException;
	
    /**
	 *Deletes DbInfo instances by DbInfo.DiName.
	 */
	int DeleteByDiName(String diName) throws SQLException;
	
    /**
	 *Deletes DbInfo instances by DbInfo.DiClassname.
	 */
	int DeleteByDiClassname(String diClassname) throws SQLException;
	
    /**
	 *Deletes DbInfo instances by DbInfo.DiLinks.
	 */
	int DeleteByDiLinks(String diLinks) throws SQLException;
	
    /**
	 *Deletes DbInfo instances by DbInfo.DiCreatetime.
	 */
	int DeleteByDiCreatetime(Long diCreatetime) throws SQLException;
	
	/**
	 *Reload the underlying database record of a DbInfo instance.
	 */
	void Reload(DbInfo obj) throws SQLException;
	
}
