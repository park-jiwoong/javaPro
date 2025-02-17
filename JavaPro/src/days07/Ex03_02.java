package days07;

import java.lang.reflect.Array;

import javax.xml.crypto.Data;

public class Ex03_02 {

	public static void main(String[] args) {

		String date = "홍길동, 이창익, 서영학, 정창기";
		String regex ="\\s*,\\s*";
		String [] names = date.split(regex);
		
		for (String name : names) {
			//System.out.printf("[%s]\n", name.trim());
			System.out.printf("[%s]\n", name);
			
		}// for
	}//main
	
}//class
