package Activity4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double minInYears = 60 * 24 * 365; // minutes per day in a year
		Scanner sc = new Scanner(System.in);

		System.out.println("Input minute(s) amount");
		double min = sc.nextDouble(); //minutes entered

		long years =(long) (min / minInYears);	
		int days = (int) (min/60/24) %365;
		
        System.out.println((int) min + " minutes is around  " + years + " years and " + days + " days");

		
		
sc.close();
	}

}
