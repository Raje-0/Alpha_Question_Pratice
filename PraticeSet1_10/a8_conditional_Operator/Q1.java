package a8_conditional_Operator;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("no is odd");
		}
	}

}
