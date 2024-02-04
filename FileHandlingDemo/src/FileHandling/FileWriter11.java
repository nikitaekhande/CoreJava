package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter11 {

    public static void main(String[] args) {
        FileWriter f = null;

        try 
        {
            f = new FileWriter("C:/Users/ekhan/Downloads/example11.txt");
            f.write("Java is the best programming language");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        
        finally 
        {
            try 
            {
                if (f != null)
                {
                    f.close();
                }
            } 
            
            catch (IOException e) 
            
            {
                e.printStackTrace();
            }
        }

        System.out.println("Successfully wrote data in the file");
    }
}

	

		
	

