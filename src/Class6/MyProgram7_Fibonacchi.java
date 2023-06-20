package Class6;

import java.util.Scanner;

public class MyProgram7_Fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Give me pos num for Fibonacchi");
		int num = sc.nextInt();

		while (num < 0) {
			System.out.println("invalid. Please re enter");
			num = sc.nextInt();
		}

		int a = 0, b = 1, c = 0;
		// 0, 1, 1, 2, 3, 5, 8....
		for (int i = 1; i <= num; i++) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}
		sc.close();
	}

}
