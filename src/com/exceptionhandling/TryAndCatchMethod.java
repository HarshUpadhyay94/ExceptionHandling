package com.exceptionhandling;

public class TryAndCatchMethod {

	public static void main(String[] args) {

		try {
			int a = 10 / 100;
			System.out.println(a);
			String b = "vijay";
			System.out.println(b.charAt(7));

		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		} 
		catch (IndexOutOfBoundsException b) {
			System.out.println(b.getMessage());
		}
	}
}
