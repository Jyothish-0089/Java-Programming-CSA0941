
public class Outter {
	void out() {
		System.out.println("Outter method");
	}
	static class Inner{
		void in(){
			System.out.println("Inner method");
		}
	}
	public static void main(String[] args) {
		Outter o = new Outter();
		Inner i = new Inner();
		o.out();
		i.in();
	}
}
