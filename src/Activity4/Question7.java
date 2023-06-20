package Activity4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("give me a positive number");
		int num = sc.nextInt();

		while (num < 0) {
			System.out.println("wrong input please re enter: ");
			num = sc.nextInt();
		}

		int fact = 1;

		if (num == 0) {
			fact = 1;
		}

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial of " + num + " is : " + fact);
		
		sc.close();

	}

}
