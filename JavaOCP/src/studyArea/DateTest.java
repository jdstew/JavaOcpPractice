package studyArea;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		DayOfWeek day = today.getDayOfWeek();
		int daysTilMonday = (DayOfWeek.SUNDAY.ordinal() - day.ordinal() + 1) % 7;
		
		LocalDate nextMonday = today.plusDays(daysTilMonday);
		System.out.println (nextMonday.format(DateTimeFormatter.ISO_DATE) + " is a " + nextMonday.getDayOfWeek());
	}
}
