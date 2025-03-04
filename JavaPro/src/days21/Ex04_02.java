package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex04_02 {

	public static void main(String[] args) {

		//2. j.t.LocalTime 클래스
		LocalTime t = LocalTime.now();
		System.out.println(t); //12:03:46.311735700
	
		//시
		//int hour = t.get(ChronoField.HOUR_OF_DAY);
		int hour = t.getHour();
		System.out.println(hour);
		
		//분
		//int minute = t.get(ChronoField.MINUTE_OF_HOUR);
		int minute = t.getMinute();
		System.out.println(minute);
		
		//초
		int second = t.get(ChronoField.SECOND_OF_MINUTE);
		//int second = t.getSecond();
		System.out.println(second);
		//밀리초
		int millisecond = t.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(millisecond);
		
		//나노초
		int nanosecond = t.get(ChronoField.NANO_OF_SECOND);
		System.out.println(nanosecond);
		
		
	}//main

}//cla
