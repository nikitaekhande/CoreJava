package FileHandling;

import java.io.FileReader;

import java.io.IOException;

public class FileReader11 {
	
	public static void main(String args[]) {
		
		try {
			
			FileReader r = new FileReader("C:/Users/ekhan/Downloads/example11.txt");
					
			try 
			
			{
			 int i;
				while((i =r.read())!=-1) 
				{
					
					System.out.print((char)i);
				}
			}
			finally 
			{
				r.close();
				
				System.out.println("---------File get closed");
			}
		}
		catch(IOException i)
		{
			
			System.out.println(i);
			
		}
	}

}
