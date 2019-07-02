package studyArea;

import java.util.Arrays;

public class Cloning {

	public static void main(String[] args) {
		int[] ia = {1, 2, 3, 4, 5};
		
		int cia[] = ia.clone();
		
		System.out.println("ia is: ");	
		Arrays.stream(ia, 0, ia.length - 1).forEach(System.out::println);
		System.out.println("cia is: ");
		Arrays.stream(ia, 0, cia.length - 1).forEach(System.out::println);
		System.out.println ("the two arrays are " + ia.equals((int[]) cia)); //false
		
	}

}
