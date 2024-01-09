import java.util.*;
public class arraysort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		String[] Array = new String[size];
		for(int i=0; i<size; i++) {
			Array[i] = sc.next();
		}
		Arrays.sort(Array);
		System.out.println("Ascending Array: ");
		//for(int i=0; i<size; i++) {
		//	System.out.print(Array[i]+" ");
		//}
		for(String ListArray:Array) {
			System.out.print(ListArray+" ");
		}
		System.out.println();
		System.out.println("Descending Array: ");
		for(int i=size-1; i>=0; i--) {
			System.out.print(Array[i]+" ");
		}
	}
}
