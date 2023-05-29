package a11_Fuction_and_Method;

import java.util.Scanner;

/*
 * Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
 */
public class Q3 {
	public static boolean ispalindrome(int n) {
		int palindrome = n; // copied number into variable
		int reverse = 0;
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (n == reverse) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ispalindrome(n));
	}

}
