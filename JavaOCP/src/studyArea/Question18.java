package studyArea;

import java.util.Arrays;
import java.util.Comparator;

public class Question18 {

	public static void main(String[] args) {
		// note: this Comparator is not used in the Arrays.sort method
		// if it had, it wouldn't sort correctly
		Comparator<String> comparer = (country1, country2) -> country2.compareTo(country2);
		String[] brics = {"Brazil", "Russia","India", "China"};
		Arrays.sort(brics, null);
		Arrays.stream(brics).forEach(country -> System.out.print(country + ", "));

	}
}
