package modulo_11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDate_LocalDateTime_Instant_Module_11 {
	public static void main(String[] args) {
		LocalDate data1 = LocalDate.now();
		LocalDateTime data2 = LocalDateTime.now();
		Instant data3 = Instant.now();
		
		LocalDate data4 = LocalDate.parse("2024-02-14");
		LocalDateTime data5 =LocalDateTime.parse("2024-02-14T01:30:26");
		Instant data6 = Instant.parse("2024-02-14T21:40:26.790530700-03:00");
		Instant data7 = Instant.parse("2024-02-14T21:40:26.790530700Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate data8 = LocalDate.parse("08/08/2002", fmt1);
		
		LocalDate data9 = LocalDate.of(2024, 8, 8);
		LocalDateTime data10 = LocalDateTime.of(2024, 03, 06, 9, 45);
		
		LocalDate data11 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
		
		LocalDateTime data12 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
		
		Date date1 = new Date();
		
		/*for (String string : ZoneId.getAvailableZoneIds()) {
			System.out.println(string);
		}*/
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);
		System.out.println("data4: " + data4);
		System.out.println("data5: " + data5);
		System.out.println("data6: " + data6);
		System.out.println("data7: " + data7);
		System.out.println("data8: " + data8);
		System.out.println("data9: " + data9.format(fmt1));
		System.out.println("data10: " + data10.format(fmt2));
		System.out.println("data7: " + fmt3.format(data7));
		System.out.println("date1: " + date1);
		System.out.println("data11: " + data11);
		System.out.println("data12: " + data12);
		System.out.println("data1 dia da semana: " + data1.getDayOfWeek());
		System.out.println("data10 hora: " + data10.getHour());
	}
}
