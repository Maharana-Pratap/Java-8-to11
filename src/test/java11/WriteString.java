package test.java11;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteString {

	public static void main(String[] args) {
		try {
			File file = new File("abc.txt");
			Path filePath = FileSystems.getDefault().getPath(file.getAbsolutePath());
			Files.createFile(filePath);
			boolean isfile = Files.isWritable(filePath);
			if(isfile) {
				Files.writeString(Path.of("abc.txt"),"First string entry");
			}
		}catch(Exception ex) {
			
		}		
	}
}
