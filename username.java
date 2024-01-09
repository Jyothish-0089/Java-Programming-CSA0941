/*The username length must range between 7 to 20 characters otherwise,
it will consider as an invalid username.
The username is allowed to contain only underscores ( _ ) 
other than alphanumeric characters.
The first character of the username must be an alphabetic character,
i.e., [a-z] or [A-Z].
*/
import java.util.*;
public class username {
	public static void main(String args[]) {
		int first_flag = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String name = sc.nextLine();
		int size = name.length();
		for(int i=0; i<1; i++){
			if((size>20)||(size<7)) {
				first_flag = 1;
				break;
			}
			char o = name.charAt(0);
			if(Character.isAlphabetic(o)) {
				first_flag = 0;
			}
			else {
				first_flag = 1;
				break;
			}
		}
		
			
		int second_flag = 1;
		for(int i=1; i<size; i++) {
			if(name.charAt(i)=='_') {
				second_flag = 0;
			}
			else if(Character.isLetterOrDigit(name.charAt(i))) {
				second_flag = 0;
			}
			else if(Character.isWhitespace(name.charAt(i))) {
				second_flag = 1;
				break;
			}
			else {
				second_flag = 1;
			}
		}
		int main_flag = 1;
		if((first_flag == 1)||(second_flag == 1)) {
			main_flag = 1;
		}
		else {
			main_flag = 0;
		}
		
		
		if(main_flag == 0) {
			System.out.print(name+" is Valid");
		}
		else {
			System.out.print(name+" is Invalid");
		}
		sc.close();
	}
}
