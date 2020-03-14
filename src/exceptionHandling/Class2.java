package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class2 {
	
	static FileReader fd;
	
	public static void main(String[] args) throws IOException {
		
		try {
		fd = new FileReader("abc.txt");
		System.out.println("Line 2 of try");
		System.out.println("Line 3 of try");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}finally {
			
			fd.close();
		}
		
		
		
		
		
	}
}
