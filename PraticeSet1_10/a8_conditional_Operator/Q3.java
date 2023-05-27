package a8_conditional_Operator;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday ");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("out of scope");
			break;
		}
	}

}
