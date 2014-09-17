package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * TemplateInfo
 */
public class TemplateInfo implements Serializable {
    

    private Long tiId;
	
	/**
	 *getter tiId
	 */
	public Long getTiId() {
    	return tiId;
    }
	
	/**
	 *setter tiId
	 */
	public void setTiId(Long tiId) {
    	this.tiId = tiId;
    }
	

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
	

    private Long tiCreatetime;
	
	/**
	 *getter tiCreatetime
	 */
	public Long getTiCreatetime() {
    	return tiCreatetime;
    }
	
	/**
	 *setter tiCreatetime
	 */
	public void setTiCreatetime(Long tiCreatetime) {
    	this.tiCreatetime = tiCreatetime;
    }
	

}
