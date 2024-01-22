import java.util.Scanner;
public class areaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Base: ");
		int b = sc.nextInt();
		System.out.print("Height: ");
		int h = sc.nextInt();
		int area = (b*h)/2;
		System.out.print("Area of Triangle is "+area);
		sc.close();
	}

}
