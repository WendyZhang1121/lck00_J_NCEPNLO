package lck00_J_NCEPNLO;

public class SomeObject {
	public Object lock = new Object();
	public void changeValue() { 
		synchronized (lock) {
		}
		// ... 
	}
}
