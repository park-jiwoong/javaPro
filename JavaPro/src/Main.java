import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //→ InputStreamReader → BufferedReader를 감싸서 사용
		int t = Integer.parseInt(br.readLine()); //→ 한 줄을 문자열로 읽음
		
		StringTokenizer st; // 문자열을 공백 단위로 분리하기 위한 객체
		StringBuilder sb = new StringBuilder(); //문자열을 빠르게 추가(append) 하기 위한 객체 (출력 성능 향상을 위해 사용)
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine()," "); //<- new를 외 여기로?
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}// main

}// class
