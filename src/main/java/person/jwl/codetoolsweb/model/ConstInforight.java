package person.jwl.codetoolsweb.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * ConstInfo_right，供右端常量选择使用
 */
public class ConstInforight extends ConstInfo implements Serializable {
    
	
    private Boolean ischecked;

    /**
     * ConstInfo
     * @return
     */
	public Boolean getIschecked() {
		return ischecked;
	}

	/**
	 * 是否选择
	 * @param ischecked
	 */
	public void setIschecked(Boolean ischecked) {
		this.ischecked = ischecked;
	}
	

}
