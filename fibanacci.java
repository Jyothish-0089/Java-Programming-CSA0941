import java.util.*;
public class fibanacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int range = sc.nextInt(); 
		int a=0,b=1,c;
		for(int i=0; i<range;i++) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
			
		}
		sc.close();
	}

}
