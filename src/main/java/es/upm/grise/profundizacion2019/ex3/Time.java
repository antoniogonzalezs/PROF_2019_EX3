package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	LocalDateTime startDate;
	
	public Time(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime time2 = startDate.plusSeconds(seconds);
		return formatter.format(time2);	
	}

}
