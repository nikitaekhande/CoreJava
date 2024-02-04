package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwskeyword {
	
	public static void readFile(String filepath)throws FileNotFoundException{
		FileReader fileReader = new FileReader(filepath);
		
		
	}
	
	public  static void main(String args[]) {
		
		try {
			
			readFile("nikita.txt");
			
			System.out.println("file read succesfully");
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
