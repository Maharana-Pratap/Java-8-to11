package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadFileTest {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("abc.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.append("first line");
			pw.append("second line");
			pw.close();
		}catch(Exception ex) {
			
		}
		try (BufferedReader br = new BufferedReader(new java.io.FileReader("abc.txt"))) {
		      String line = br.readLine();
		      System.out.println(line);
		    }
		    catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    finally {
		      // Probably no need as auto-close happens in try (....)
		    }
	}

}
