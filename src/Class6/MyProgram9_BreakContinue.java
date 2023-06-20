package Class6;

import java.util.Scanner;

public class MyProgram9_BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this program ask user 6 times 2 values
		// and give the result of first val by second vall

		final int LIMIT = 6;
		int count = 0;
		double val1, val2;

		Scanner sc = new Scanner(System.in);
		System.out.println("You will be allowed 6 times to enter");
		System.out.println("You may enter -1 -1 at anytime to stop");
		System.out.println();

		while (count < LIMIT) {
			count++;
			System.out.println("This is division " + count + ": ");
			System.out.println("please enter the nubmers");
			val1 = sc.nextDouble();
			val2 = sc.nextDouble();

			if (val1 == -1 && val2 == -1) {
				break; // break statement will get out from the while
			}

			if (val2 == 0) {
				System.out.println("You cant do this, you lost 1 attempt");
				continue;
			}

			System.out.println("Division # " + count + " Resul is " + val1 / val2);
			System.out.println();

		}
		System.out.println("Thank you, done");
		sc.close();

	}

}
