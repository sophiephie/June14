package Activity4;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		System.out.println("A : ");
		for (i = 5; i >= 1; i--) {
			for (j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("================");
		System.out.println("B : ");
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("================");
		System.out.println("C : ");

		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("================");
		System.out.println("D : ");

		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			for (int space = 5; space >= i; space--) {
				System.out.print(" ");
			}
			
		}
		System.out.println();

		System.out.println("================");
		System.out.println("E : ");
		
		for (i = 1; i <= 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println();
			for (int space = 5; space >= i; space--) {
				System.out.print(" ");
			}
		}

}
}
