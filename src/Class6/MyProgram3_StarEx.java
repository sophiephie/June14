package Class6;

import java.util.Scanner;

public class MyProgram3_StarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * imagine user give me 5
		 * 
		 * * * * * * * * * * *
		 */

		int nl;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter value for num of line between 1 to 15");
		nl = sc.nextInt();
		while (nl < 1 || nl > 15) { // setting up the restriction range
			System.out.println("not valid, pleas put it again");
			nl = sc.nextInt();
		}
		
		int i, j;

		for ( i = 1; i <= nl; i++) {
			for ( j = 1; j <= i; j++) { // j is dependent on i
				System.out.print("* ");
			}
			System.out.println();
		}
		i = 22;
		j = i*2;
		
	System.out.println("my i is :" + i + "my j is " + j);
	
		sc.close();
	}

}
