package chap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTime {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println("===================");
		
		LocalDate d1 = LocalDate.of(2017, Month.FEBRUARY, 21);
		System.out.println(d1);
		
		String data = d1.toString();
		System.out.println("data: "+ data);
		
		System.out.println("==================");
		
		LocalTime time = LocalTime.of(12, 04);
		System.out.println("time: "+time);
		
		System.out.println("==================");
		
		LocalDate l = LocalDate.of(2017, Month.FEBRUARY, 28);
		System.out.println(l);
		l = l.plusWeeks(2);
		System.out.println(l);	
		l = l.plusDays(2);
		System.out.println(l);	
		
		System.out.println("==================");
		System.out.println(l.isAfter(d1));
		System.out.println(l.isBefore(d1));
		
		System.out.println("==================");
		
		Period period = Period.ofMonths(1);
		System.out.println(period);
		
	}
	
	
	
	
	
	
	
	
}
