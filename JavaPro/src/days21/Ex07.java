package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex07 {

	public static void main(String[] args) {

//		날짜 - 날짜 = Period 클래스
//		시간 - 시간 = Duration 클래스
		
		//[문제] 개강일로부터 오늘까지 날짜 간격
		LocalDate o = LocalDate.of(2025, 2, 3);
		LocalDate t = LocalDate.now();
		
		//Period.between() 메소드를 통해서 날짜간의 간격(차)를
		//Period  객체로 얻어올 수 있다
		//							o ← 포함		t ← 포함 x
		Period p = Period.between(o, t);
		System.out.println(p.getYears());	//0
		System.out.println(p.getMonths());	//1
		System.out.println(p.getDays());	//1
		
		System.err.println(p.get(ChronoUnit.YEARS));
		System.err.println(p.get(ChronoUnit.MONTHS));
		System.err.println(p.get(ChronoUnit.DAYS));
		System.out.println("-".repeat(60)); //줄 간격 만들기
		
		// 시간 시간의 간격 : Duration 클래스
		// [문제] 오늘 수 업 시작 시간이 얼마나 지났는지 확인
		LocalTime s = LocalTime.of(9, 0, 0);
		LocalTime n = LocalTime.now();
		
		Duration d = Duration.between(s, n);
		
		
//		System.out.println(d.getSeconds() / (60 * 60)); // 5tlrks
//		System.out.println(d.getSeconds() % 60);		//47분
		// 초
		System.out.println(d.toHours());				//	6시
		System.out.println(d.toMinutes());				// 363분
		int minutes = (int)(d.toMinutes() % 60);		//	4분 long 형이니까 int로 변환
		System.out.println(minutes);
		int second = (int)(d.getSeconds() % 60);
		System.out.println(second);
		
//		System.out.println(d.getSeconds());				//20987
//		System.out.println(d.getNano());
		
		//between()과 until() 차이점
		// ㄴstatic			ㄴ객체 생성
		// Period.between
		// Duration.between(s, n);
		
	}//main

}//class
