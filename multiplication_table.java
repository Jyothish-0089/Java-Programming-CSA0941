import java.util.*;
public class multiplication_table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		System.out.print("Range: ");
		int range = sc.nextInt();
		System.out.println("Multiplication Table for "+num);
		System.out.println();
		for(int i=1; i<=range; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		sc.close();
	}
}
