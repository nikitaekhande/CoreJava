package MultiThreadingDemo;

public class PriorityMtd extends Thread{
	
	public void run() {
		System.out.println("priority of thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getPriority());
		
		PriorityMtd mtd = new PriorityMtd();
		mtd.run();
	//	mtd.start();
	}

}
