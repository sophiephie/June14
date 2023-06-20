package Class6;

public class MyProgram11_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addfivetoit(8);
		System.out.println(addfivetoit(8));// (8) = argument (value of parameters)
		add(8, 2); // (type matters, cannot put 2.4 as argument ( value of parameters)
		System.out.println(add(8, 2));
		add(7, 9);
		System.out.println(add(7, 9));
		sub(8, 2);
		mult(8, 2);
		div(8, 2);
		System.out.println(sub(8,2));
		System.out.println(mult(8,2));
		System.out.println(div(8,2));

	}

	public static int addfivetoit(int x) { // (int x) = parameter
		return x + 5;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mult(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

}
