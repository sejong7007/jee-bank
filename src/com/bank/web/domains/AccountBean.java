package com.bank.web.domains;

import java.io.Serializable;

public class AccountBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String accountNum, today, money;
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "AccountBean [accountNum=" + accountNum + ", today=" + today + ", money=" + money + "]";
	}
	
	
}
