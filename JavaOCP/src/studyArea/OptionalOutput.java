package studyArea;

import java.util.*;

public class OptionalOutput {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(-5, 0, 5);
		
		Optional<Integer> o = l.stream().max((j, k) -> Integer.compare(j, k));
		System.out.println("max is " + (o.isPresent() ? o.get() : 0));
		
		// note if the list is empty an error will be throw by the next line
		Integer i = l.stream().max((j, k) -> Integer.compare(j, k)).get();
		System.out.println("max is " + i);

	}

}
