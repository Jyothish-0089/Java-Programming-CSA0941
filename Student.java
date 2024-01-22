/*
 *  Create a constructor that assigns the values for the student details
 *  such as student name, register number, and five subject marks. 
 *  Calculate the total and average of five subject marks and display the 
 *  marks and average using OOPs concept.
 */
import java.util.*;
public class Student {
	Scanner sc = new Scanner(System.in);
	Student(String name,int reg,int s1,int s2,int s3,int s4,int s5) {
		int sub1 = s1;
		int sub2 = s2;
		int sub3 = s3;
		int sub4 = s4;
		int sub5 = s5;
	}
	public void Calculate(int sub1,int sub2,int sub3,int sub4,int sub5) {
		int total = sub1+sub2+sub3+sub4+sub5;
		float avg = (float)total/500;
		
	}
	public void Display() {
		String name;
		int reg,total;
		float avg;
		System.out.println("Student Name: "+name);
		System.out.println("Register no: "+reg);
		System.out.println("Total marks: "+total);
		System.out.println("Average marks: "+avg);
	}
	public static void main(String[] args) {
		int sub1,sub2,sub3,sub4,sub5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Register no: ");
		int reg = sc.nextInt();
		System.out.print("Subject-1 Marks(/100): ");
		int s1 = sc.nextInt();
		System.out.print("Subject-2 Marks(/100): ");
		int s2 = sc.nextInt();
		System.out.print("Subject-3 Marks(/100): ");
		int s3 = sc.nextInt();
		System.out.print("Subject-4 Marks(/100): ");
		int s4 = sc.nextInt();
		System.out.print("Subject-5 Marks(/100): ");
		int s5 = sc.nextInt();
		Student obj = new Student(name,reg,s1,s2,s3,s4,s5);
		obj.Calculate(sub1,sub2,sub3,sub4,sub5);
		obj.Display();
		
	}
}
