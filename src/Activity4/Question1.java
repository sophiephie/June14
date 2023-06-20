package Activity4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Input your investment amount, the interest rate and the number of investment year.");
		double amount = sc.nextDouble(); // investment amount
		double rateperc = sc.nextDouble(); // interest rate percentage
		double year = sc.nextInt(); // number of investment years

		double rate = (rateperc / 100) + 1;
		double pow = Math.pow(rate, year);

		double profit = amount * pow;

		System.out.println(profit);

	}

}
