import java.*;
import java.util.Scanner;
public class matrixadd {
	public static void main(String args[]) {
		int[][] m3 = new int[2][2];
		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input for Matrix A: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input for Matrix B: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		for(int i=0; i<2; i++) {
			System.out.println();
			for(int j=0; j<2; j++) {
				System.out.print(m3[i][j]+" ");
			}
		}
	}
}
