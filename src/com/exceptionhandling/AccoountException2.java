package com.exceptionhandling;

public class AccoountException2 {
	public static void main(String[] args) throws Insufficentbalance {
		AccountException s=new AccountException();
		s.deposite(1000);
		s.withdraw(600);
		System.out.println(s.getBalance());
	}
}
