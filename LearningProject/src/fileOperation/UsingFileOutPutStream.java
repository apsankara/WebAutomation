package fileOperation;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutPutStream {

	public static void main(String[] args) throws IOException {
		String Location="UsingFOS.txt";
		String content="I like this video";
		
		FileOutputStream outputstream=new FileOutputStream(Location);
		byte[] writecontentbyte=content.getBytes();
		outputstream.write(writecontentbyte);
		outputstream.close();
		
	}

}
