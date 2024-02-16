package modulo_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Date_Module_11 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		format3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date date1 = format1.parse("06/03/2002"); 
		Date date2 = format2.parse("06/03/2002 09:45:00");
		Date date3 =  new Date(); //or new Date(System.currentTimeMillis()) works the same way
		Date date4 =  new Date(0L);
		//Date date5 =  new Date.from(Instant.parse("2002-03-03T09:45:00Z")); deprecated
		
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		System.out.println("date3: " + date3);
		System.out.println("date4: " + date4);
		
		System.out.println("date1 format1: " + format1.format(date1));
		System.out.println("date2 format2: " + format2.format(date2));
		System.out.println("date2 format2: " + format3.format(date2));

	}

}
