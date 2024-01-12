//Write a Java program to print the vowels and consonants in the given statement?
//Sample Input: Saveetha School of Engineering
import java.util.*;
public class assign3_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		int n = str.length();
		String s = str.toLowerCase();
		String cons="",vow="";
		int vowel = 0,consonant = 0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowel++;
				vow += str.charAt(i)+" "; 
				
			}
			else if(!Character.isWhitespace(s.charAt(i))){
				consonant++;
				cons += str.charAt(i)+" ";
			}
		}
		System.out.println();
		System.out.println("Number of Vowels: "+vowel);
		System.out.println(vow);
		System.out.println("Number of Consonants: "+consonant);
		System.out.println(cons);
	}
}
