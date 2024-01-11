/*
    1
   2 2
  3 3 3
 4 4 4 4
  3 3 3 
   2 2
    1
 */
import java.util.*;
public class assign2_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Range: ");
		int n = sc.nextInt();
		int i;
		for(i=1; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		int k=1;
		for(i=n-1; i>=0; i--) {
			for(int j = 1; j<=k; j++) {
				System.out.print(" ");
			}
			k++;
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}









