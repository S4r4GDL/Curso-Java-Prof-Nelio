package modulo_11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculations_Dates {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.parse("2002-08-08");
		LocalDateTime data2 = LocalDateTime.parse("2002-03-06T09:45:00");
		Instant data3 = Instant.parse("2024-02-14T21:40:26.790530700-03:00");
		
		LocalDate pastWeekLocalDate = data1.minusWeeks(1);
		LocalDate nextWeekLocalDate = data1.plusDays(7);
		
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		
		LocalDateTime hourLocalDateTime = data2.plusHours(10);
		LocalDateTime minuteLocalDateTime = data2.minusMinutes(45);
		
		System.out.println("hourLocalDateTime: " + hourLocalDateTime);
		System.out.println("minuteLocalDateTime: " + minuteLocalDateTime);
		
		LocalDateTime pastWeekLocalDateTime = data2.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = data2.plusWeeks(1);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		Instant pastWeekLocalInstant = data3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = data3.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalInstant: " + pastWeekLocalInstant);
		System.out.println("nextWeekLocalInstant: " + nextWeekLocalInstant);
		
		Duration d1 = Duration.between(data2, data1.atTime(0, 0, 0)); //or data1.atStartOfDay()
		
		System.out.println("Duration between data2 and data1: " + d1.toDays());
		
		Duration d2 = Duration.between(pastWeekLocalInstant, nextWeekLocalInstant); //or data1.atStartOfDay()
		
		System.out.println("Duration between pastWeekLocalInstant and nextWeekLocalInstant: " + d2.toDays());
		
	}

}
