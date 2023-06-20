package Class6;

public class MyProgram10_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// F(x) = x + y (function)

		myFun(); //can print many times
//		int age = myage(); System.out.println(age); or
		System.out.println(myage());
		
		String myname = myname();
		System.out.println(myname());
		System.out.println(myname);
	}

	public static void myFun() {
		System.out.println("Hello I am inside function");

	}
	
	public static int myage() {
		return 18; 
	}
	
	public static String myname() {
		return "Pargol";
	}

}
