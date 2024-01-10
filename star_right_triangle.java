import java.util.*;
public class star_right_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows: ");
		int n = sc.nextInt();
		int k=n;
		for(int i=0; i<n; i++) {
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			k--;
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
