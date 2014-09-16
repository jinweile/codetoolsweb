package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * DbInfo
 */
public class DbInfo implements Serializable {
    

    private Integer diId;
	
	/**
	 *getter diId
	 */
	public Integer getDiId() {
    	return diId;
    }
	
	/**
	 *setter diId
	 */
	public void setDiId(Integer diId) {
    	this.diId = diId;
    }
	

    private String diName;
	
	/**
	 *getter diName
	 */
	public String getDiName() {
    	return diName;
    }
	
	/**
	 *setter diName
	 */
	public void setDiName(String diName) {
    	this.diName = diName;
    }
	

    private String diClassname;
	
	/**
	 *getter diClassname
	 */
	public String getDiClassname() {
    	return diClassname;
    }
	
	/**
	 *setter diClassname
	 */
	public void setDiClassname(String diClassname) {
    	this.diClassname = diClassname;
    }
	

    private String diLinks;
	
	/**
	 *getter diLinks
	 */
	public String getDiLinks() {
    	return diLinks;
    }
	
	/**
	 *setter diLinks
	 */
	public void setDiLinks(String diLinks) {
    	this.diLinks = diLinks;
    }
	

    private String diTablesql;
	
	/**
	 *getter diTablesql
	 */
	public String getDiTablesql() {
    	return diTablesql;
    }
	
	/**
	 *setter diTablesql
	 */
	public void setDiTablesql(String diTablesql) {
    	this.diTablesql = diTablesql;
    }
	

    private String diColsql;
	
	/**
	 *getter diColsql
	 */
	public String getDiColsql() {
    	return diColsql;
    }
	
	/**
	 *setter diColsql
	 */
	public void setDiColsql(String diColsql) {
    	this.diColsql = diColsql;
    }
	

    private Date diCreatetime;
	
	/**
	 *getter diCreatetime
	 */
	public Date getDiCreatetime() {
    	return diCreatetime;
    }
	
	/**
	 *setter diCreatetime
	 */
	public void setDiCreatetime(Date diCreatetime) {
    	this.diCreatetime = diCreatetime;
    }
	

}
