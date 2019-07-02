package studyArea;

import java.util.*;
import java.time.*;
import java.time.format.TextStyle;

public class LocaleThis {

	
	
	public static void main (String [] args) {
		Locale us = Locale.US;
		
		System.out.println(
				"Zone data... " +
				ZoneId.systemDefault().getDisplayName(TextStyle.FULL, Locale.US) +
				"\n"
				);
		
		System.out.println("getCountry is " + us.getCountry());
		System.out.println("getDisplayCountry is " + us.getDisplayCountry());
		System.out.println("getDisplayLanguage is " + us.getDisplayLanguage());
		System.out.println("getDisplayName is " + us.getDisplayName());
		System.out.println("getDisplayScript is " + us.getDisplayScript());
		System.out.println("getDisplayVariant is " + us.getDisplayVariant());
		System.out.println("getISO3Country is " + us.getISO3Country());
		System.out.println("getISO3Language is " + us.getISO3Language());
		System.out.println("toString is " + us.toString());
		
		List<Locale> ll = Arrays.asList(Locale.getAvailableLocales());
		ll.forEach(l -> System.out.println(l.toString()));
		
	
		
	}
	
}
