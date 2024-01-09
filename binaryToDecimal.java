import java.util.*;
import java.lang.Math;
public class binaryToDecimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Binary Input: ");
		int bin = sc.nextInt();
		int rem=1; 
		double sum = 0, i=0;
		int temp = bin;
		while(temp > 0) {
			rem = temp%10;
			temp = temp/10;
			double pow = Math.pow(2, i);
			sum = (rem*pow)+sum;
			i=i+1;
			//System.out.println("Sum = "+sum);
			System.out.print(rem+" ");
		}
		int SUM = (int)sum;
		System.out.println();
		System.out.print("Decimal Output: "+SUM);
		sc.close();
	}
}
