package FileHandling;

import java.io.*;

public class CreateFile {
	
	public static void main(String args[]) {
		
		File f = new File("C:/Users/ekhan/Downloads/example111.txt");
		
		try {
			if (f.createNewFile()) {
				System.out.println("File successfully created....!");
			} else {
				System.out.println("File already exists..!");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}
	}
}

