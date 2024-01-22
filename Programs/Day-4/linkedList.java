import java.util.*;
public class linkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Raiden");
		list.add("Shogun");
		list.add("Yae");
		list.add("Miko");
		list.add("Sara");

		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
