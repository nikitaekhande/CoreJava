package FileHandling;

import java.io.File;

public class RenameFile {
	
	public static void main(String args[]) {
		
		File f = new File("C:/Users/ekhan/Downloads/example11.txt");
		
		File r = new File("C:/Users/ekhan/Downloads/example22.txt");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File does not exist");
		}
	}

}
