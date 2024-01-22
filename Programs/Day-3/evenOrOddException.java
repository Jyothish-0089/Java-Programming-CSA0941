import java.util.*;
public class evenOrOddException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if(num%2!=0){
			sc.close();
			throw new IllegalArgumentException("Odd Number Exception");
		}
		else {
			System.out.print("Given number is Even");
		}
		sc.close();
	}
}
