package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex09_05 {

	public static void main(String[] args) {
		//C:\Class\JavaClass\JavaPro
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);

		//		.  상대경로 - 하위 디렉토리
		//		.. 상대경로 - 상위 디렉토리
//		String fileName = ".\\.classpath";
//		String fileName = ".classpath";	// 파일명 
		String fileName = dir + "\\.classpath";	// 파일명 
		
//		String fileName = ".\\..\\sample.java";
		String line = null;
		int lineNumber = 1;

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) { // 매개변수 다형성

			while ((line = br.readLine())!= null) {
				System.out.printf("%d : %s\n", lineNumber++, line);

			}
			line = br.readLine();
			System.out.println(line);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("end");
	} // main

} // class
