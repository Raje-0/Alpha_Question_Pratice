package a11_Fuction_and_Method;

//Question 1 : Write a Java method to compute the average of three numbers..
public class Q1 {
	public static int avg(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(avg(1, 2, 3));
	}

}
