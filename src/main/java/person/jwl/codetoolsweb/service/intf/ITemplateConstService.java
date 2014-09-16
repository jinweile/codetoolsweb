package person.jwl.codetoolsweb.service.intf;

import java.sql.SQLException;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.math.BigDecimal;

import person.jwl.codetoolsweb.model.*;

/**
 *ITemplateConstService is the Service interface for person.jwl.codetoolsweb.model.TemplateConst
 */
public interface ITemplateConstService {        

	/**
	 *Returns the total count of objects
	 */
	int GetCount() throws SQLException;

	/**
	 *Finds a TemplateConst instance by the primary key value
	 */
	TemplateConst Find(Integer tcId) throws SQLException;

	/**
	 *Finds all TemplateConst instances.
	 */
	List<TemplateConst> FindAll() throws SQLException;
	
	/**
	 *Finds all TemplateConst instances without Lob columns loaded.
	 */
	List<TemplateConst> QuickFindAll() throws SQLException;
	
	/**
	 *Finds TemplateConst instances by TiId value.
	 */
	List<TemplateConst> FindByTiId(Integer tiId) throws SQLException;
	
	/**
	 *Finds TemplateConst instances by CoiId value.
	 */
	List<TemplateConst> FindByCoiId(Integer coiId) throws SQLException;
	
	/**
	 *Inserts a new TemplateConst instance into underlying database table.
	 */
	Integer Insert(TemplateConst obj) throws SQLException;
	
	/**
	 *Update the underlying database record of a TemplateConst instance.
	 */
	int Update(TemplateConst obj) throws SQLException;
	
	/**
	 *Delete the underlying database record of a TemplateConst instance.
	 */
	int Delete(TemplateConst obj) throws SQLException;
	
    /**
	 *Deletes TemplateConst instances by TemplateConst.TiId.
	 */
	int DeleteByTiId(Integer tiId) throws SQLException;
	
    /**
	 *Deletes TemplateConst instances by TemplateConst.CoiId.
	 */
	int DeleteByCoiId(Integer coiId) throws SQLException;
	
	/**
	 *Reload the underlying database record of a TemplateConst instance.
	 */
	void Reload(TemplateConst obj) throws SQLException;
	
}
