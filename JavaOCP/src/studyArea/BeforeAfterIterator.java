package studyArea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeforeAfterIterator {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("one");
		l.add("two");
		
		Iterator<String> i = l.iterator();
		
//		l.add("THREE"); // ConcurrentModificationException will occur if allowed (runtime, not compile time error)
		
		while (i.hasNext()) System.out.println(i.next());
	}
}
