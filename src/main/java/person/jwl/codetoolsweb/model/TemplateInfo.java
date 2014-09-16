package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * TemplateInfo
 */
public class TemplateInfo implements Serializable {
    

    private Integer tiId;
	
	/**
	 *getter tiId
	 */
	public Integer getTiId() {
    	return tiId;
    }
	
	/**
	 *setter tiId
	 */
	public void setTiId(Integer tiId) {
    	this.tiId = tiId;
    }
	

    private Integer tpId;
	
	/**
	 *getter tpId
	 */
	public Integer getTpId() {
    	return tpId;
    }
	
	/**
	 *setter tpId
	 */
	public void setTpId(Integer tpId) {
    	this.tpId = tpId;
    }
	

    private String tiName;
	
	/**
	 *getter tiName
	 */
	public String getTiName() {
    	return tiName;
    }
	
	/**
	 *setter tiName
	 */
	public void setTiName(String tiName) {
    	this.tiName = tiName;
    }
	

    private String tiContent;
	
	/**
	 *getter tiContent
	 */
	public String getTiContent() {
    	return tiContent;
    }
	
	/**
	 *setter tiContent
	 */
	public void setTiContent(String tiContent) {
    	this.tiContent = tiContent;
    }
	

    private Date tiCreatetime;
	
	/**
	 *getter tiCreatetime
	 */
	public Date getTiCreatetime() {
    	return tiCreatetime;
    }
	
	/**
	 *setter tiCreatetime
	 */
	public void setTiCreatetime(Date tiCreatetime) {
    	this.tiCreatetime = tiCreatetime;
    }
	

}
