package Activity4;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a Fahrenheit tempurature");
		int fah = sc.nextInt(); //Fahrenheit
		
		double cel = (fah - 32) / 1.8;
		
		System.out.println("In Celcius, its : " + cel);

sc.close();
	}

}
