package a8_conditional_Operator;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your body temp");
		double temp=103.5;
		double a=sc.nextDouble();
		if(a>=temp) {
			System.out.println("tumhe bhukhar hai jao lalan clinic");
		}else {
			System.out.println("tum hot ho ...bhukhar nhi hai");
		}
	}

}
