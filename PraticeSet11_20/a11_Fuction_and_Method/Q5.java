package a11_Fuction_and_Method;

import java.util.Scanner;

/*
 * Write a Java method to compute the sum of the digits in an integer
 */
public class Q5 {
	public static int sumDigits(int n) {
		int sumOfDigits = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			sumOfDigits += lastDigit;
			n /= 10;
		}
		return sumOfDigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int digits = sc.nextInt();
		System.out.println("The sum is " + sumDigits(digits));

	}

}
