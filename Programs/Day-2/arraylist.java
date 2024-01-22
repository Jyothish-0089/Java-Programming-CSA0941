import java.util.*;
public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Raiden");
		list.add("Shogun");
		list.add("Yae");
		list.add("Miko");
		list.add("Sara");

		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
