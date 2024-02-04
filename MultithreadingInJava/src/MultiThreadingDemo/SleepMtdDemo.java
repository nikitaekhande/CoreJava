package MultiThreadingDemo;

public class SleepMtdDemo extends Thread
{
	
	public void run() 
	{
		
		System.out.println("sleep method");
		
		try {
			
			for(int i= 0; i<5;i++) 
			{
				
				Thread.sleep(1000);
				System.out.println(i);
			}
	}
		catch(Exception e) 
		{
			
			System.out.println(e);
		}
	}
	public static void main(String args[]) 
	{
		SleepMtdDemo sd = new SleepMtdDemo();
		
		sd.start();
		//sd.run();
		
	}
}
	
	                         
	                     
       
                     
