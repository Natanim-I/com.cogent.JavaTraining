/**
 * 
 */
package com.cogent.model;

/**
 * @author: Natanim
 *
 * @date: Jan 18, 2023
 */
public class Customer {

	private String cId; 
	private String cName; 
	private String cEmail; 
	private String cDOB;
	
	public Customer() {
		super();
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcDOB() {
		return cDOB;
	}

	public void setcDOB(String cDOB) {
		this.cDOB = cDOB;
	}
	
}
