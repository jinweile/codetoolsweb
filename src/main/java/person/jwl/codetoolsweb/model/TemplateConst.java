package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * TemplateConst
 */
public class TemplateConst implements Serializable {
    

    private Long tcId;
	
	/**
	 *getter tcId
	 */
	public Long getTcId() {
    	return tcId;
    }
	
	/**
	 *setter tcId
	 */
	public void setTcId(Long tcId) {
    	this.tcId = tcId;
    }
	

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
	

    private Long coiId;
	
	/**
	 *getter coiId
	 */
	public Long getCoiId() {
    	return coiId;
    }
	
	/**
	 *setter coiId
	 */
	public void setCoiId(Long coiId) {
    	this.coiId = coiId;
    }
	

}
