package studyArea;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {
	
	public static void main (String... args) {
		try (BufferedReader br = new BufferedReader(new FileReader ("C:\\tmp\\data.txt"))) {
			br.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		
	}

}
