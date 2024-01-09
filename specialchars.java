import java.util.*;
public class specialchars {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Line: ");
		String line = sc.nextLine();
		int count = 0;
		System.out.print("Special Characters: ");
		for(int i=0; i<line.length(); i++) {
			if((!(Character.isLetterOrDigit(line.charAt(i)))||(Character.isWhitespace(line.charAt(i))))) {
				System.out.print(line.charAt(i));
				count++;
			}
		}
		System.out.println();
		System.out.print("Number of Special Characters: "+count);
	}
}
//RAIDEN&$@shogun123