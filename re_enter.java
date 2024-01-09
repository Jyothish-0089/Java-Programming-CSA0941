import java.util.*;
public class re_enter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String name = sc.nextLine();
		System.out.print("Re-enter username: ");
		String re_enter = sc.nextLine();
		if(re_enter.equals(name)){
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
