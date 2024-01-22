import java.util.*;
public class findX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("    a+b+c");
		System.out.println("x = -----");
		System.out.println("    4(a^2)");
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		int x = (a+b+c)/(4*a*a);
		System.out.print("Value of x: "+x);
	}

}
