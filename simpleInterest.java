import java.util.*;
public class simpleInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Principle amount: ");
		int P = sc.nextInt();
		System.out.print("No of years: ");
		int T = sc.nextInt();
		System.out.print("Is customer senior citizen(y/n): ");
		int R = 10;
		String choice = sc.next();
		if(choice.equals("y")) {
			R = 12;
		}
		int SI = (P*T*R)/100;
		System.out.print("Simple Interest: "+SI);
		sc.close();
	}
}
