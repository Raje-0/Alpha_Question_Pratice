package a9_Loop;

import java.util.Scanner;

/*Question 4 : Write a program to print the multiplication table of a number N, entered by the
user.*/
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter your number");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int ans=1;
for(int i=1; i<n;i++) {
	ans=n*i;
	System.out.println(ans);
}
	}

}
