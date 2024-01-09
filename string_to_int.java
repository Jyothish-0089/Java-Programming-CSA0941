import java.util.Scanner;
public class string_to_int {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		int num = Integer.parseInt(str);
		System.out.print("Converted String to Int: "+num);
	}
}
