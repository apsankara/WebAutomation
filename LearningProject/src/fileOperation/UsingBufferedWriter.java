package fileOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		String location="Test1.txt";
		String content="Welcome TO Automation Learning ";
		
		FileWriter filewriter=new FileWriter(location);
		BufferedWriter bwriter=new BufferedWriter(filewriter);
		bwriter.write(content);
		bwriter.close();
	}

}
