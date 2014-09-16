package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * ConstInfo
 */
public class ConstInfo implements Serializable {
    

    private Integer coiId;
	
	/**
	 *getter coiId
	 */
	public Integer getCoiId() {
    	return coiId;
    }
	
	/**
	 *setter coiId
	 */
	public void setCoiId(Integer coiId) {
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
	

    private Date coiCreatetime;
	
	/**
	 *getter coiCreatetime
	 */
	public Date getCoiCreatetime() {
    	return coiCreatetime;
    }
	
	/**
	 *setter coiCreatetime
	 */
	public void setCoiCreatetime(Date coiCreatetime) {
    	this.coiCreatetime = coiCreatetime;
    }
	

}
