package com.exceptionhandling;

public class AccountException {
	public String number;
	public String accounttype;
	public double balance;


	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdraw (double W) throws Insufficentbalance  {
		this.balance= this.balance-W;	
		if(balance<500) {
		Insufficentbalance r= new Insufficentbalance();
		throw r;
		}
	}
	public void deposite (double ds) {
	this.balance=ds+this.balance;
	}
	public void paybill (double pb)  {
	this.balance=this.balance-pb;
	}
}
