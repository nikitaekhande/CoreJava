package ExceptionHandling;

public class finallykeyword {
	
	public static void main(String args[]) {
		
		try 
		{
		int data =90/2;
		
		System.out.println(data);
		}
	
	 catch(ArithmeticException e) 
	 {
		 
		 System.out.println(e);
		 
	 }
	 
	 finally {
		 System.out.println("finally block always excuted");
		 
	 }
	 
	 System.out.println("rest of the code");
	

}
}
