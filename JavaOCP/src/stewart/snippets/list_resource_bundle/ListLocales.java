package stewart.snippets.list_resource_bundle;

import java.util.Arrays;
import java.util.Locale;

public class ListLocales {

	public static void main(String[] args) {
		Arrays.stream(Locale.getAvailableLocales())
			.sorted((locale0, locale1) -> locale0.getDisplayName().compareTo(locale1.getDisplayName()) )
			.forEach(locale2 ->
				System.out.printf("locale code: %s and it stands for %s \n",
						locale2, locale2.getDisplayName()));

	}

}
