package studyArea;

import java.util.function.*;
import java.util.stream.IntStream;

public class FunctionClassExamples {
	
	static int add (BinaryOperator<Integer> adder) {
		return adder.apply(2,  4);
	}
	

	public static void main(String[] args) {
		"Wonderful".chars().filter(c -> c != (int)'d').forEach(e -> System.out.print((char)e));
		System.out.println();
		
		
		System.out.println("how many exclusive? " + IntStream.range(1, 1).count());
		
		BinaryOperator<Integer> addInt = (x, y) -> x + y;
		System.out.println(addInt.apply(1,  2));
		
		System.out.println(FunctionClassExamples.add(addInt));
		

	}

}
