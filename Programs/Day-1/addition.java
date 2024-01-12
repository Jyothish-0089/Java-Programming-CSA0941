import java.util.Scanner;
public class addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		int a = sc.nextInt();
		System.out.print("Enter B: ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.print("Result C: "+c);
		sc.close();
	}
}
