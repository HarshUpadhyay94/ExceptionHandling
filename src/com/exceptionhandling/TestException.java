package com.exceptionhandling;

public class TestException {

	public static void main(String[] args){
		auth("vijay");
		
	}

	private static void auth(String login) {
		
		if(!login.equals ("admin")) {
			Loginexception e= new Loginexception();
			try {
			throw e;
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
			}
			}
}
}