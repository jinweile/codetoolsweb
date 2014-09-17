package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * ConstInfo
 */
public class ConstInfo implements Serializable {
    

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
	

    private String coiCode;
	
	/**
	 *getter coiCode
	 */
	public String getCoiCode() {
    	return coiCode;
    }
	
	/**
	 *setter coiCode
	 */
	public void setCoiCode(String coiCode) {
    	this.coiCode = coiCode;
    }
	

    private String coiName;
	
	/**
	 *getter coiName
	 */
	public String getCoiName() {
    	return coiName;
    }
	
	/**
	 *setter coiName
	 */
	public void setCoiName(String coiName) {
    	this.coiName = coiName;
    }
	

    private String coiRemark;
	
	/**
	 *getter coiRemark
	 */
	public String getCoiRemark() {
    	return coiRemark;
    }
	
	/**
	 *setter coiRemark
	 */
	public void setCoiRemark(String coiRemark) {
    	this.coiRemark = coiRemark;
    }
	

    private Long coiCreatetime;
	
	/**
	 *getter coiCreatetime
	 */
	public Long getCoiCreatetime() {
    	return coiCreatetime;
    }
	
	/**
	 *setter coiCreatetime
	 */
	public void setCoiCreatetime(Long coiCreatetime) {
    	this.coiCreatetime = coiCreatetime;
    }
	

}
