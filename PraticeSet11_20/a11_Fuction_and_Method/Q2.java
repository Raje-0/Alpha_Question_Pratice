package a11_Fuction_and_Method;

import java.util.Scanner;

/*
 * Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.

 */
public class Q2 {
	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		Q2 a = new Q2();

		System.out.println(a.isEven(n));
	}

}
