package Activity4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		char grade;

		Scanner sc = new Scanner(System.in);

		System.out.println("Give me your mark");
		mark = sc.nextInt();

		if (mark >= 80) {
			grade = 'A';
		} else if (mark >= 60) {
			grade = 'B';
		} else if (mark >= 50) {
			grade = 'C';
		} else if (mark >= 45) {
			grade = 'D';
		} else if (mark >= 25) {
			grade = 'E';
		} else {
			grade = 'F';
		}

		System.out.println("Based on your mark of " + mark + "%, your grade is : " + grade);

		sc.close();

	}

}
