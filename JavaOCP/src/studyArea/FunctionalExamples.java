package studyArea;

import java.util.*;
import java.util.function.*;

public class FunctionalExamples {

	public static void main(String[] args) {
		Predicate<String> pred = s -> s.endsWith("ing");
		System.out.println ("Testing testing for \"ing\" = " + pred.test("testing"));
		
		
		
		List<Integer> l = new ArrayList<>();
		Consumer<Integer> con = c -> l.add(c);
		con.accept(10);
		System.out.println(l);
		
		Supplier<Integer> r = () -> new Random().nextInt();
		System.out.println ("random number is " + r.get());
		
		Function<String, Integer> parseInt = s -> Integer.parseInt(s);
		System.out.println ("Function test = " + parseInt.apply("3"));
		
		Predicate<Boolean> test = b -> Boolean.FALSE;
		System.out.println ("it doesn't matter what you put, it's false... " + test.test(true));
		
		List<Character> c = new ArrayList<>();
		ObjIntConsumer<String> charAt =  (str, i) -> c.add(str.charAt(i));
		charAt.accept("Java", 2);
		System.out.println(c);
	}
}
