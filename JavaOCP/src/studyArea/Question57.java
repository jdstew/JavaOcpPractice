package studyArea;

import java.time.*;
import java.util.function.*;

public class Question57 {

	public static void main(String[] args) {
		// Note a method reference is used to REPLACE a lambda expression, but it doesn't work WITHIN a lambda expression
//		Supplier<LocalDate> now1 = () -> LocalDate::now; // note: this doesn't work because it doesn't explicitly return something
//		Supplier<LocalDate> now2 = () -> {return LocalDate::now;}; 
		Supplier<LocalDate> now3 = LocalDate::now; 

//		now2.get();
		
		Consumer<String> c1 = s1 -> System.out.println(s1);
		Consumer<String> c2 = System.out::println;
	}

}
