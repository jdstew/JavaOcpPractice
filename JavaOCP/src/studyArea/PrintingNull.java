package studyArea;

public class PrintingNull {

	public static void main(String[] args) {
//		System.out.println(null);  // this does not compile
		
		System.out.printf("%s", null); // printf has a defined 'null' response to a null value for the conversion value of 's'

	}

}
