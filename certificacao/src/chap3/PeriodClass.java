package chap3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodClass {
	
	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 29);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String formatada = start.format(formatador);
		System.out.println(formatada);
		
		System.out.println("================");
		LocalDate l = LocalDate.parse(formatada,formatador);
		System.out.println(l);
		
		
		
		
		
		
		
		
		//teste(start, end, period);
	}
	
	private static void teste(LocalDate start, LocalDate end, Period period) {
		
		System.out.println(start.getMonth().getValue());
		System.out.println("================");
	
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
}
