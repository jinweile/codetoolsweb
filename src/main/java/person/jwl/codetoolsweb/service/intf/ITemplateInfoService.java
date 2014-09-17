package person.jwl.codetoolsweb.service.intf;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.model.*;

/**
 *ITemplateInfoService is the Service interface for person.jwl.codetoolsweb.model.TemplateInfo
 */
public interface ITemplateInfoService {        

	/**
	 *Returns the total count of objects
	 */
	int GetCount() throws SQLException;

	/**
	 *Finds a TemplateInfo instance by the primary key value
	 */
	TemplateInfo Find(Long tiId) throws SQLException;

	/**
	 *Finds a TemplateInfo instance by the primary key value without Lob columns loaded
	 */
	TemplateInfo QuickFind(Long tiId) throws SQLException;
	
	/**
	 *Finds all TemplateInfo instances.
	 */
	List<TemplateInfo> FindAll() throws SQLException;
	
	/**
	 *Finds all TemplateInfo instances without Lob columns loaded.
	 */
	List<TemplateInfo> QuickFindAll() throws SQLException;
	
	/**
	 *Finds TemplateInfo instances by TpId value.
	 */
	List<TemplateInfo> FindByTpId(Long tpId) throws SQLException;
	
	/**
	 *Finds TemplateInfo instances by TpId value without Lob columns loaded.
	 */
	List<TemplateInfo> QuickFindByTpId(Long tpId) throws SQLException;
	
	/**
	 *Finds TemplateInfo instances by TiName value.
	 */
	List<TemplateInfo> FindByTiName(String tiName) throws SQLException;
	
	/**
	 *Finds TemplateInfo instances by TiName value without Lob columns loaded.
	 */
	List<TemplateInfo> QuickFindByTiName(String tiName) throws SQLException;
	
	/**
	 *Finds TemplateInfo instances by TiCreatetime value.
	 */
	List<TemplateInfo> FindByTiCreatetime(Long tiCreatetime) throws SQLException;
	
	/**
	 *Finds TemplateInfo instances by TiCreatetime value without Lob columns loaded.
	 */
	List<TemplateInfo> QuickFindByTiCreatetime(Long tiCreatetime) throws SQLException;
	
	/**
	 *Inserts a new TemplateInfo instance into underlying database table.
	 */
	Long Insert(TemplateInfo obj) throws SQLException;
	
	/**
	 *Update the underlying database record of a TemplateInfo instance.
	 */
	int Update(TemplateInfo obj) throws SQLException;
	
	/**
	 *Delete the underlying database record of a TemplateInfo instance.
	 */
	int Delete(TemplateInfo obj) throws SQLException;
	
    /**
	 *Deletes TemplateInfo instances by TemplateInfo.TpId.
	 */
	int DeleteByTpId(Long tpId) throws SQLException;
	
    /**
	 *Deletes TemplateInfo instances by TemplateInfo.TiName.
	 */
	int DeleteByTiName(String tiName) throws SQLException;
	
    /**
	 *Deletes TemplateInfo instances by TemplateInfo.TiCreatetime.
	 */
	int DeleteByTiCreatetime(Long tiCreatetime) throws SQLException;
	
	/**
	 *Reload the underlying database record of a TemplateInfo instance.
	 */
	void Reload(TemplateInfo obj) throws SQLException;
	
}
