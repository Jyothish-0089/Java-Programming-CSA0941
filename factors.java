import java.util.*;
class factors {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		System.out.print("N'th place: ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				list.add(i);
			}
		}
		System.out.println("List: "+list);
		while(n > list.size()) {
			System.out.println("Invalid Index, Size is "+list.size());
			System.out.print("Enter Index again: ");
			n = sc.nextInt();
		}
		System.out.print(n+"'th Factor is "+list.get(n-1));

		
		
	}
}
