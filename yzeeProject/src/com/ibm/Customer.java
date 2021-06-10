package com.ibm;

public class Customer {
	private int cusId;
	private String cusName;
	private String cusEmail;
	public Customer() {
		super();
	}
	public Customer(int cusId, String cusName, String cusEmail) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusEmail = cusEmail;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusEmail=" + cusEmail + "]";
	}
	
	
	
	

}
