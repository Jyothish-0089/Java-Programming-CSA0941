/*
Find the Mean, Median, and Mode of the array of numbers.
Sample Input:
Array of elements = {16, 18, 27, 16, 23, 21, 19}
Sample Output:
      Mean = 20
    Median = 19
       Mode = 16
 */
import java.util.*;
public class assign2_Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int j=0; j<size;j++) {
			System.out.print("Enter Element: ");
			arr[j]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		for(int i: arr) {
			sum = sum+i;
			System.out.print(i+" ");
		}
		float mean = (float)sum/size;
		System.out.println();
		System.out.print("Mean: "+mean);
		int median=0,mid = size/2;
		if(size%2==1) {
			median = arr[mid];
		}
		else if(size%2==0) {
			median = (arr[mid]+arr[mid+1])/2;
		}
		else {
			System.out.print("Dont worry this wont get printed- UNLESS IT DID-");
		}
		System.out.println();
		System.out.print("Median: "+median);
		//1 2 2 3 4 5
		int count=0,maxvalue=0,maxcount=1;
		for(int i : arr) {
			count=0;
			for(int j: arr) {
				if(i==j) {
					count++;
				}
			}
			if(count > maxcount) {
				maxvalue = i;
			}
		}
		System.out.println();
		System.out.print("Mode: "+maxvalue);
	}
}
