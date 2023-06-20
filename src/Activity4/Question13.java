package Activity4;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input nubmer of terms: ");
		int num = sc.nextInt();
		int answer = 0;

		for (int i = 0; i <= num; ++i) {
			answer += 10*Math.exp(i) + 1;
		}
		System.out.println(answer);

		
		sc.close();

	}

}
