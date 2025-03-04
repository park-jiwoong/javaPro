package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex04 {

	public static void main(String[] args) {
		//1. LocalDate 클래스
		//LocalDate d = //new로 객체 생성 안함 
		LocalDate d = LocalDate.now(); //현재 날짜 정보
		System.out.println(d);
		
		//년
		int year = d.get(ChronoField.YEAR);
		System.out.println(year);
		
		//월
		//int month = d.getMonthValue();
		//Month month = d.getMonth();
		int month = d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
	
		//일
		//int date = d.getDayOfYear();
		//int date = d.getDayOfMonth();
		int date = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(date);
		
		//요일 1(월) 2(화) ~ 7(토)
	 	//DayOfWeek dow = d.getDayOfWeek();
		
		int dow = d.get(ChronoField.DAY_OF_WEEK);
		System.out.println( dow );             // TUESDAY
		
		// 윤년체크 메소드 
		System.out.println( d.isLeapYear() );
	 	
	}//main

}//class
