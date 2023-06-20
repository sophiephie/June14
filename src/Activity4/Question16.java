package Activity4;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i * j < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
				System.out.print(j * i);
			}
			System.out.println();


		}

	}
}