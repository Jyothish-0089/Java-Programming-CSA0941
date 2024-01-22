public class tryCatch {

	public static void main(String[] args) {
		try {
			System.out.print(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.print("Cannot divide a number by 0");
		}

	}

}
