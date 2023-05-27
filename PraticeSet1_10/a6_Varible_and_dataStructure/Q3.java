package a6_Varible_and_dataStructure;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the cost of all 3 items");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		float total=a+b+c;
		System.out.println("total price will be "+total );
		
		System.out.println("total price including GST will be "+total +(total*18)/100);
	}

}
