package studyArea;

import java.util.Arrays;
import java.util.function.*;
import java.util.List;

public class IntFuncAndUnary {

	public static void main(String[] args) {
		IntFunction<Integer> intF = i -> i*i;
		UnaryOperator<Integer> unOp =  j -> -j;
		
		List<Integer> il = Arrays.asList(1, 2, 3, 4, 5, 6);
		
//		il.add(7);  // note, this won't work Arrays.asList creates an immutable List
		
		il.stream().map(intF::apply).map(unOp::apply).forEach(System.out::println);

	}

}
