package lck00_J_NCEPNLO;


public class TestThread implements Runnable {

	public void run() {
		// Untrusted code
		SomeObject someObject = new SomeObject(); 
		someObject.changeValue();
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
