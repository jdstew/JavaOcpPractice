package stewart.snippets;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduce {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 4, 5, 6);
		
		Optional<Integer> o = l.stream().reduce((i, j) -> i + j);
		
		if (o.isPresent()) System.out.println(o.get());

	}

}
