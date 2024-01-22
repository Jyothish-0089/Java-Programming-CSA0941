import java.util.*;
public class arrayreverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter Size of array: ");
		size = sc.nextInt();
		String[] list = new String[size];
		String[] rev = new String[size];
		for(int i=0; i<size; i++) {
			list[i] = sc.next();
		}
		
		System.out.print("Reversed Array: ");
		for(int i=size-1,j=0; i>=0; i--,j++) {
			rev[j]=list[i];
			System.out.print(list[i]+" ");
		}
	}
}
