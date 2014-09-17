package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * TemplateProject
 */
public class TemplateProject implements Serializable {
    

    private Long tpId;
	
	/**
	 *getter tpId
	 */
	public Long getTpId() {
    	return tpId;
    }
	
	/**
	 *setter tpId
	 */
	public void setTpId(Long tpId) {
    	this.tpId = tpId;
    }
	

    private String tpName;
	
	/**
	 *getter tpName
	 */
	public String getTpName() {
    	return tpName;
    }
	
	/**
	 *setter tpName
	 */
	public void setTpName(String tpName) {
    	this.tpName = tpName;
    }
	

    private String tpRemark;
	
	/**
	 *getter tpRemark
	 */
	public String getTpRemark() {
    	return tpRemark;
    }
	
	/**
	 *setter tpRemark
	 */
	public void setTpRemark(String tpRemark) {
    	this.tpRemark = tpRemark;
    }
	

    private String tpOutinfo;
	
	/**
	 *getter tpOutinfo
	 */
	public String getTpOutinfo() {
    	return tpOutinfo;
    }
	
	/**
	 *setter tpOutinfo
	 */
	public void setTpOutinfo(String tpOutinfo) {
    	this.tpOutinfo = tpOutinfo;
    }
	

    private Long tpCreatetime;
	
	/**
	 *getter tpCreatetime
	 */
	public Long getTpCreatetime() {
    	return tpCreatetime;
    }
	
	/**
	 *setter tpCreatetime
	 */
	public void setTpCreatetime(Long tpCreatetime) {
    	this.tpCreatetime = tpCreatetime;
    }
	

}
