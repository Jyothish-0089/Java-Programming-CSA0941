import java.util.*;
public class star_inverse_pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows: ");
		int n = sc.nextInt();
		int k=n;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=k-1; j>=0; j--) {
				System.out.print("* ");
			}
			k--;
			System.out.println();
		}
	}

}
