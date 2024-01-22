/*
Find the year of the given date is leap year or not
Sample Input:
Enter Date: 04/11/1947
Sample Output:
Given year is Non Leap Year
 */
import java.util.*;
import java.lang.String;
public class leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date in dd/mm/yyyy format: ");
		String date = sc.next();
		while(date.length()!=10) {
			System.out.print("Please Enter in dd/mm/yyyy formate");
			date = sc.next();
		}
		String[] year = date.split("/");
		int yr = Integer.parseInt(year[2]);
		System.out.println("Given year "+yr);
		if((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
			System.out.print("Yes, It's a Leap Year");
		}
		else {
			System.out.print("No, It's not a Leap Year");
		}
		sc.close();
	}

}
