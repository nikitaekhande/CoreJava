package MultiThreadingDemo;

import java.lang.*;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnable Interface task");
		
		
	}
	
	public static void main(String args[]) {
		RunnableInterface ri = new RunnableInterface();
		
		Thread th = new Thread(ri);
		th.start();
	
	}

	

}
