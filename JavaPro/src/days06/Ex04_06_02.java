package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex04_06_02 {

	public static void main(String[] args) {
		// 세 정수(n,m,o) 중에 가장 큰값, 작은값
		// [문제] 여러 20개의 정수 중에 가장 큰값, 작은값 출력
		// ( 배열을 사용해서 처리 )
		// 메모리 자동 처리 / 관리

		// 람다식과 스트림(Stream)
				int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
				
				// int[] -> int스트림 변환
				OptionalInt max = IntStream.of(m).max(); //스트림
				
				// getAsInt() : OptionalInt -> int
				if (max.isPresent()) {
					System.out.println(max.getAsInt());			
				} // if
				
				// [2]
				// max = new Random().ints(0, 101).limit(10).max();

	}// main
}// class
