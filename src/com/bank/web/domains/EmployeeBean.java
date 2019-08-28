package com.bank.web.domains;

public class EmployeeBean extends MemberBean {

	private static final long serialVersionUID = 1L;
	private String sabun;

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	
	@Override
	public String toString() {
		return "MemberBean [id=" + getId() 
						+ ", pw=" + getPw() 
						+ ", name=" + getName() 
						+ ", sssn=" + getSsn() 
						+ "사번="+sabun+"]";
	}
	
}
