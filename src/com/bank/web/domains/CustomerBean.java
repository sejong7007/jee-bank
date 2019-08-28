package com.bank.web.domains;

public class CustomerBean extends MemberBean{

	private String credit;

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}
	
	@Override
	public String toString() {
		return "MemberBean [id=" + getId() 
						+ ", pw=" + getPw() 
						+ ", name=" + getName() 
						+ ", sssn=" + getSsn() 
						+ "credit="+credit+"]";
	}
	
}
