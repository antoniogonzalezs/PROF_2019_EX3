package es.upm.grise.profundizacion2019.ex3;

import org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.Timer;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	Time time;
	Time mockitoTime;
	static final String EXPECTED_RESULT = "2020/01/01 00:02:00";
	static final LocalDateTime START_DATE = LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0);
	
	@Before
	public void setUp() {
		my = new MyClass(START_DATE);
		time = new Time(START_DATE);
		mockitoTime = mock(Time.class);
	}

	@Test
	public void smoleTest() {
		long SECONDS = 120;
		my.nextTime(SECONDS);
	}
	
	/* TEST PARA LA CLASE GETFUTURE TIME */
	@Test
	public void timeTest() {
		Time time = new Time(START_DATE);
		long SECONDS = 120;
		String RETURNED = time.getFutureTime(SECONDS);
		assertEquals(EXPECTED_RESULT, RETURNED);
	}
	
	/* TEST MOCKITO */
	@Test
	public void mockitoTest() {
		long SECONDS = 120;
		my.nextTime(SECONDS);
		verify(mockitoTime, times(1)).getFutureTime(SECONDS);
	}
}
