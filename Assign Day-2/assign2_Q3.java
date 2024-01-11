/*
Write a Program to Find the Nth Largest Number in an array.
Sample Input:
Array: {14, 67, 48, 5, 62,23}
N = 4
 */
import java.util.*;
public class assign2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] rev = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter Element: ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int j=0;
		for(int i=size-1; i>=0; i--) {
			rev[j]=arr[i];
			j++;
		}
		System.out.print("Enter the value of N: ");
		int n = sc.nextInt();
		
		System.out.print(rev[n-1]);
		
	}

}
