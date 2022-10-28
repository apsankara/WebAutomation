package fileOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		
		String Location="Test.txt";
		
		FileReader reader=new FileReader(Location);
		
		try (BufferedReader bufferreader = new BufferedReader(reader)) {
			//String line=bufferreader.readLine();
			String line;
			
			while((line=bufferreader.readLine())!= null) {
				System.out.println(line);
			}
		}
		
		
	}

}
