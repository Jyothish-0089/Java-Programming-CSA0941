import java.util.*;
public class reverse_number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int temp = num,rem = 0;
		System.out.print("Reversed : ");
		while(temp!=0) {
			rem = temp%10;
			System.out.print(rem);
			temp = temp/10;
		}
	}
}
