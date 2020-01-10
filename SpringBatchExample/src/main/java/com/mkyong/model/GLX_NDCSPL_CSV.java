/**
 * 
 */
package com.mkyong.model;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * @author saralere
 *
 */
public class GLX_NDCSPL_CSV implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ITEMCODE;
	private String NDC11;
	private String PROPRIETARYNAME;
	private String DOSAGEFORM;
	private String MARKETINGCATEGORY;
	private String APPNUMORCITATION;
	private String PRODUCTTYPE;
	private String MARKETSTARTDATE;
	private String MARKETENDDATE;
	private String BILLINGUNIT;
	public String getITEMCODE() {
		return ITEMCODE;
	}
	public void setITEMCODE(String iTEMCODE) {
		ITEMCODE = iTEMCODE;
	}
	public String getNDC11() {
		return NDC11;
	}
	public void setNDC11(String nDC11) {
		NDC11 = nDC11;
	}
	public String getPROPRIETARYNAME() {
		return PROPRIETARYNAME;
	}
	public void setPROPRIETARYNAME(String pROPRIETARYNAME) {
		PROPRIETARYNAME = pROPRIETARYNAME;
	}
	public String getDOSAGEFORM() {
		return DOSAGEFORM;
	}
	public void setDOSAGEFORM(String dOSAGEFORM) {
		DOSAGEFORM = dOSAGEFORM;
	}
	public String getMARKETINGCATEGORY() {
		return MARKETINGCATEGORY;
	}
	public void setMARKETINGCATEGORY(String mARKETINGCATEGORY) {
		MARKETINGCATEGORY = mARKETINGCATEGORY;
	}
	public String getAPPNUMORCITATION() {
		return APPNUMORCITATION;
	}
	public void setAPPNUMORCITATION(String aPPNUMORCITATION) {
		APPNUMORCITATION = aPPNUMORCITATION;
	}
	public String getPRODUCTTYPE() {
		return PRODUCTTYPE;
	}
	public void setPRODUCTTYPE(String pRODUCTTYPE) {
		PRODUCTTYPE = pRODUCTTYPE;
	}
	public String getMARKETSTARTDATE() {
		return MARKETSTARTDATE;
	}
	public void setMARKETSTARTDATE(String mARKETSTARTDATE) {
		MARKETSTARTDATE = mARKETSTARTDATE;
	}
	public String getMARKETENDDATE() {
		return MARKETENDDATE;
	}
	public void setMARKETENDDATE(String mARKETENDDATE) {
		MARKETENDDATE = mARKETENDDATE;
	}
	public String getBILLINGUNIT() {
		return BILLINGUNIT;
	}
	public void setBILLINGUNIT(String bILLINGUNIT) {
		BILLINGUNIT = bILLINGUNIT;
	}
	
	
	
	

	
}
