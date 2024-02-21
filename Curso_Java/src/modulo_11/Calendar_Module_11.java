package modulo_11;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Module_11 {

	public static void main(String[] args) {

		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date1 = Date.from(Instant.parse("2023-03-06T15:42:07Z"));
		
		System.out.println(fmt.format(date1));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		date1 = calendar.getTime();
		
		System.out.println(fmt.format(date1));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.getFirstDayOfWeek());
		
		
	}

}
