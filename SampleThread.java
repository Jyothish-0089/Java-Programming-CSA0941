import java.lang.Thread;
public class SampleThread extends Thread {
	public void run(){
		try {
			Thread.sleep(2000);
			System.out.println("Sleeping ...zzZZ");
			Thread.sleep(2000);
			System.out.println("Goodmorning");
		} catch (Exception e) {
			System.out.print(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		SampleThread st = new SampleThread();
		System.out.println("Thread Start: Goodnight ");
		st.start();
	}

}
