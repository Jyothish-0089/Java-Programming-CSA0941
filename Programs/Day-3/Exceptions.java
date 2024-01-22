//import java.util.*;
import java.lang.*;
public class Exceptions {
	void arithmetic_exception(){
		try {
			int a = 10;
			System.out.print(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("1. Cannot divide by zero");
		}
	}
	void array_bound() {
		try {
			String[] arr = {"1","2","3"};
			System.out.print(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2. Array index out of range");
		}
	}
	void class_not_found() {
		try {
			newclass obj = new newclass();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Exceptions ex = new Exceptions();
		ex.arithmetic_exception();
		ex.array_bound();
		ex.class_not_found();
		}
	}
