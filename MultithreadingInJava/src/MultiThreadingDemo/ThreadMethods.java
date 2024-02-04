package MultiThreadingDemo;

public class ThreadMethods  extends Thread {
	
	public void run() {
		System.out.println("Thread Task is executed by:"+Thread.currentThread().getName());
	}
	
	public static void main(String args[]) {
		
		System.out.println("theard task printed by:"+Thread.currentThread().getName());
		ThreadMethods tm = new ThreadMethods();
		 tm.start();
		tm.run();
	}
	
	

}
