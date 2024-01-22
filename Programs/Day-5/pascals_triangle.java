import java.util.Scanner;
public class pascals_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Rows: ");
		int n = sc.nextInt();
		int k=n;
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>=0; j--) {
				System.out.print(" ");
			}
			k--;
			int c=1;
			for(int j=0; j<=i; j++) {
				System.out.print(c+" ");
				c=c*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
