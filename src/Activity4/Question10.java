package Activity4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int a = sc.nextInt(); // 1st number
		int b = sc.nextInt();// 2nd number
		int c = sc.nextInt();// 3rd number

		int avg = (a + b + c) / 3;
		System.out.println("The average is " + avg);

		sc.close();
	}

}
