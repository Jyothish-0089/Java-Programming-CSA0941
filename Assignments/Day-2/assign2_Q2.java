import java.lang.Math; 
import java.util.Scanner;
class assign2_Q2 { 
	static int gcd(int a, int b) { 
		if (b == 0) 
			return a;  
		else
			return gcd(b, a % b); 
	} 
	static int lcm(int a, int b, int gcdValue) { 
		return Math.abs(a * b) / gcdValue; 
	} 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int gcdValue; 
		System.out.print("Value of a: ");
		int a = sc.nextInt();
		System.out.print("Value of b: ");
		int b = sc.nextInt();
		gcdValue = gcd(a, b); 
		System.out.println("GCD = " + gcdValue); 
		System.out.println("LCM = " + lcm(a, b, gcdValue)); 
		sc.close();
	} 
}
