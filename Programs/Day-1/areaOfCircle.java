import java.util.Scanner;
public class areaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius ");
		float r = sc.nextFloat();
		float pi = 3.14f;
		float area = pi*r*r;
		System.out.print("Area of Circle is "+area);
		sc.close();
	}

}
