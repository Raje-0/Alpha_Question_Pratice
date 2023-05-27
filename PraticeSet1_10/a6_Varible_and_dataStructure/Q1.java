package a6_Varible_and_dataStructure;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the three number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int avg = (a + b + c) / 3;
		System.out.println(avg);
	}

}
