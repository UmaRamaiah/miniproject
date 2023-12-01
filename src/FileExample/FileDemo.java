package FileExample;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f1 =new File("List Of Courses");
		if(f1.createNewFile());
		
		{
			       
			
			System.out.println("File Created");
		}
		else
				
		
				
		{
			System.out.println("File Exsist");
					
				
		}
		
		// TODO Auto-generated method stub

	}

}
