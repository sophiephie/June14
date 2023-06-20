package Class6;

import java.util.Scanner;

public class MyProgram8_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Give me a pos num");
		int num = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			if (i == num) {
				continue;
			}
			System.out.println(i);
			sc.close();
		}

	}
}