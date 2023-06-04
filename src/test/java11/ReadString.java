package test.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadString {

	public static void main(String[] args) throws IOException {
		Path fileDir = Path.of("C:\\Users\\ADMIN\\eclipse-workspace\\CoreTest");
		String fileContaint = "It is just testing for Java-11 read write file.";
		Path filePath = Files.writeString(Files.createTempFile(fileDir, "demo", ".txt"), "Sample text, "+fileContaint);
		String fileContent = Files.readString(filePath);
		System.out.println(fileContent);
	}

}
