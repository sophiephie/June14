package Activity4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 4 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		int max = Math.max(max2, d);

		System.out.println("the max is " + max);
		sc.close();
	}

}
