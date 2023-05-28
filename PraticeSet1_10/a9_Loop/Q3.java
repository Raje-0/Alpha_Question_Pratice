package a9_Loop;

import java.util.Scanner;

//Question 3 : Write a program to find the factorial of any number entered by the user.
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;

		}
		System.out.println(ans);

	}

}
