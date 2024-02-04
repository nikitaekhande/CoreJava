package FileHandling;

import java.io.File;

public class DisplayFileInfo {
	
	public static void main(String args[]) {
		File f = new File("C:/Users/ekhan/Downloads/example11.txt");
		
		if (f.exists()) {
			
			System.out.println("file name:"+f.getName());
			System.out.println("file Location:"+f.getAbsolutePath());
			System.out.println("file writable:"+f.canWrite());
			System.out.println("file readable:"+f.canRead());
			System.out.println("file size:"+f.length());
		    //System.out.println("file deleted:"+f.delete());
			
		}
		else {
			System.out.println("file does not exist");
		}
	}

}
