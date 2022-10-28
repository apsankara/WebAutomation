package fileOperation;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		String location="Test.txt";
		String content="Welcome TO Automation Learning ";
		
		FileWriter filewriter=new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
	}

}
