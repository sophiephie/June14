package Activity4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the length and the breadth of a rectangle");
		int len = sc.nextInt(); // length
		int bre = sc.nextInt(); // breadth

		if (len == bre) {
			System.out.println("This is a square");
		} else {
			System.out.println("Not a square");

		}
		sc.close();

	}

}
