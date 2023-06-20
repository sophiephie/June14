package Class6;

public class MyProgram1_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (initialize; condition if cond is true it goes inside the forloop;
		// increment/dec) {
		// Statement
		// }

//		int count;
//		for (count = 0 ; count<=10; count++) {
//			System.out.println("Count now is : " + count);
//		}

		int i;
		for (i = 1; i <= 100; i = i * 4) {
			System.out.println("1st loop - i now is : " + i);
		}
		System.out.println();

		for (i = 1000; i > 100; i = i - 200) {
			System.out.println("2nd loop - i now is ; " + i);
		}
		System.out.println();

		for (i = 100; i > 10; i--) {
			System.out.println("3rd loop - i now is ; " + i);
		}
		System.out.println();

	}

}
