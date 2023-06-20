package Activity4;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a = 0, b = 1, c = 0;
		int num = 15;
		
		for (int i = 1; i <= num; i++) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}

	}

}
