import java.util.*;
public class biggerAmong3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		int a = sc.nextInt();
		System.out.print("Enter B: ");
		int b = sc.nextInt();
		System.out.print("Enter C: ");
		int c = sc.nextInt();
		int max = c;
		if(a>b && a>c) {
			max = a;
		}
		else if(b>a && b>c) {
			max = b;
		}
		System.out.print("Max: "+max);
		sc.close();
	}
}
