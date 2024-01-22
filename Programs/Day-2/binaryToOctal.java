import java.util.*;
import java.lang.Math;
public class binaryToOctal {
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
		System.out.println("Decimal Output: "+SUM);
		sc.close();
		
		ArrayList<Integer> list = new ArrayList<>();
		int decimal = SUM;
		int Temp = decimal;
		while(Temp>0) {
			rem = Temp%8;
			list.add(rem);
			Temp = Temp/8;
		}
		//System.out.print(list);
		System.out.print("Octal Output: ");
		for(int j=list.size()-1; j>=0; j--) {
			System.out.print(list.get(j));
		}
	}
}
