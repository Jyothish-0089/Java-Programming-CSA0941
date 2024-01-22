//0 1 1 2 3 5 8 13 21
import java.util.Scanner;
public class evenFibonacci {
	int range;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.print("Enter even range: ");
		range = sc.nextInt();
	}
	void fibo() {
		int sum=0,c,a=0,b=1,i=0;
		while(i<range) {
			System.out.print(a+" ");
			if(a%2==0) {
				sum = sum+a;
			}
			c = a+b;
			a = b;
			b = c;
			i++;
		}
		System.out.println();
		System.out.print("Sum: "+sum);
	}
	public static void main(String[] args) {
		evenFibonacci fib = new evenFibonacci();
		fib.input();
		fib.fibo();
	}
}
