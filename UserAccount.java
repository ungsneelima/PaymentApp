package com.sat.tmf.pmt.entity;
import java.util.Date;

public class UserAccount {
	
	private int userAccountid;
	private Date accountopendate;
	private double currentWalletBalance;
	private int bankaccountcount;
	private String walletPin;
	private User user; //one to one relation
	public int getUseraccountid() {
		return userAccountid;
	}
	public void setUseraccountid(int useraccountid) {
		this.userAccountid = useraccountid;
	}
	public Date getAccountopendate() {
		return accountopendate;
	}
	public void setAccountopendate(Date accountopendate) {
		this.accountopendate = accountopendate;
	}
	public double getCurrentWalletBalance() {
		return currentWalletBalance;
	}
	public void setCurrentWalletBalance(double currentWalletBalance) {
		this.currentWalletBalance = currentWalletBalance;
	}
	public int getBankaccountcount() {
		return bankaccountcount;
	}
	public void setBankaccountcount(int bankaccountcount) {
		this.bankaccountcount = bankaccountcount;
	}
	public String getWalletPin() {
		return walletPin;
	}
	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
