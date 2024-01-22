import java.util.*;
import java.lang.*;
public class powerOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int flag = 1;
		for(int i=1; i<=num; i++) {
			if(Math.pow(i,3)==num) {
				System.out.println("True, "+i+"x"+i+"x"+i+" = "+num);
				flag = 0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("False");
		}
		sc.close();
	}
}
