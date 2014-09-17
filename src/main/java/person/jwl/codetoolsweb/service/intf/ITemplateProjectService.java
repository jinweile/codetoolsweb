package person.jwl.codetoolsweb.service.intf;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.model.*;

/**
 *ITemplateProjectService is the Service interface for person.jwl.codetoolsweb.model.TemplateProject
 */
public interface ITemplateProjectService {        

	/**
	 *Returns the total count of objects
	 */
	int GetCount() throws SQLException;

	/**
	 *Finds a TemplateProject instance by the primary key value
	 */
	TemplateProject Find(Long tpId) throws SQLException;

	/**
	 *Finds a TemplateProject instance by the primary key value without Lob columns loaded
	 */
	TemplateProject QuickFind(Long tpId) throws SQLException;
	
	/**
	 *Finds all TemplateProject instances.
	 */
	List<TemplateProject> FindAll() throws SQLException;
	
	/**
	 *Finds all TemplateProject instances without Lob columns loaded.
	 */
	List<TemplateProject> QuickFindAll() throws SQLException;
	
	/**
	 *Finds TemplateProject instances by TpName value.
	 */
	List<TemplateProject> FindByTpName(String tpName) throws SQLException;
	
	/**
	 *Finds TemplateProject instances by TpName value without Lob columns loaded.
	 */
	List<TemplateProject> QuickFindByTpName(String tpName) throws SQLException;
	
	/**
	 *Finds TemplateProject instances by TpRemark value.
	 */
	List<TemplateProject> FindByTpRemark(String tpRemark) throws SQLException;
	
	/**
	 *Finds TemplateProject instances by TpRemark value without Lob columns loaded.
	 */
	List<TemplateProject> QuickFindByTpRemark(String tpRemark) throws SQLException;
	
	/**
	 *Finds TemplateProject instances by TpCreatetime value.
	 */
	List<TemplateProject> FindByTpCreatetime(Long tpCreatetime) throws SQLException;
	
	/**
	 *Finds TemplateProject instances by TpCreatetime value without Lob columns loaded.
	 */
	List<TemplateProject> QuickFindByTpCreatetime(Long tpCreatetime) throws SQLException;
	
	/**
	 *Inserts a new TemplateProject instance into underlying database table.
	 */
	Long Insert(TemplateProject obj) throws SQLException;
	
	/**
	 *Update the underlying database record of a TemplateProject instance.
	 */
	int Update(TemplateProject obj) throws SQLException;
	
	/**
	 *Delete the underlying database record of a TemplateProject instance.
	 */
	int Delete(TemplateProject obj) throws SQLException;
	
    /**
	 *Deletes TemplateProject instances by TemplateProject.TpName.
	 */
	int DeleteByTpName(String tpName) throws SQLException;
	
    /**
	 *Deletes TemplateProject instances by TemplateProject.TpRemark.
	 */
	int DeleteByTpRemark(String tpRemark) throws SQLException;
	
    /**
	 *Deletes TemplateProject instances by TemplateProject.TpCreatetime.
	 */
	int DeleteByTpCreatetime(Long tpCreatetime) throws SQLException;
	
	/**
	 *Reload the underlying database record of a TemplateProject instance.
	 */
	void Reload(TemplateProject obj) throws SQLException;
	
}
