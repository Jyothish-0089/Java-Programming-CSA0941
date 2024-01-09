import java.util.*;
public class decimalToBinaryAndOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Decimal Input: ");
		int dec = sc.nextInt();
		int temp = dec,rem;
		ArrayList<Integer> binary = new ArrayList<>();
		ArrayList<Integer> octal = new ArrayList<>();
		while(temp!=0) {
			rem = temp%2;
			binary.add(rem);
			temp = temp/2;
		}
		while(dec!=0) {
			rem = dec%8;
			octal.add(rem);
			dec = dec/8;
		}
		int bin_size = binary.size();
		int oct_size = octal.size();
		System.out.print("Binary: ");
		for(int i=bin_size-1; i>=0; i--) {
			System.out.print(binary.get(i));
		}
		System.out.println();
		System.out.print("Octal: ");
		for(int i=oct_size-1; i>=0; i--) {
			System.out.print(octal.get(i));
		}
		sc.close();
	}

}
