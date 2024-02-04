package MultiThreadingDemo;

import java.lang.*;

public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("thraed task");
	}
	
	public static void main(String args[]) {
		Test t = new Test();
		t.start();
	}

}
