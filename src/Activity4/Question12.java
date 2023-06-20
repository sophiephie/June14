package Activity4;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input nubmer of terms: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
		}
		sc.close();
	}

}
