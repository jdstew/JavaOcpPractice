package studyArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LinesReader {

	public static void main(String[] args) {

		File f = new File("C:\\tmp\\lyrics.txt");
		try (
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
//			BufferedReader br = new BufferedReader(
//				new FileReader(
//					new File("C:\\tmp\\lyrics.txt")))
			) 
		{

			String s = f.exists() ? "yes" : "no";
			System.out.println(f.toPath().normalize() + " exists = " + s);
			if (f.isFile()) System.out.println(f + " is a file");
			if (f.isDirectory()) System.out.println(f + " is a directory");
			br.lines().forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
