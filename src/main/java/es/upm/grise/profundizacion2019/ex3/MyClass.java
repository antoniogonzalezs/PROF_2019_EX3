package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

public class MyClass {
	
	Time time;
	
	public MyClass(LocalDateTime startDate) {
		this.time = new Time(startDate);
	}

	public void nextTime(long seconds) {
		String next = time.getFutureTime(seconds);
		System.out.println(next);
	}

}
