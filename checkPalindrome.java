package bala.HCL.StateStreet;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter String to verify if Palindrome:");
		Scanner input = new Scanner(System.in);
		new checkPalindrome().verifyPalindrome(input.nextLine());
	}

	private void verifyPalindrome(String input) {
		String revStr = new StringBuilder(input).reverse().toString();
		if (input.equals(revStr))
			System.out.println(input + " is Palindrome");
		else 
			System.out.println(input + " is NOT Palindrome");
	}
}