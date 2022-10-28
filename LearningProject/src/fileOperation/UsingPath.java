package fileOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		String Location="Usingpath.txt";
		String content="Welcome TO path area string";
		
		Path path=Paths.get(Location);
		Files.write(path, content.getBytes());
		
		
	}

}
