package days26;

import java.io.File;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오전 10:28:24
 * @subject  days25.Ex10_05.java 참고.
 * @content  재귀 함수 사용 예제
 */
public class Ex03 {

	public static void main(String[] args) {
		// [문제1]
		// javaPro 폴더
		//    ㄴ temp 폴더 생성
		//          ㄴ 1조  폴더 생성 
		//          ㄴ 2조  폴더 생성
		//          ㄴ 3조  폴더 생성
	    /*
		String pathname = ".";  // javaPro 폴더
		File parent = new File(pathname);		
		
		for (int i = 1; i <= 3; i++) {
			File f = new File(parent, String.format("temp\\%d조", i) );
			f.mkdirs();
		} // for i
		*/
		
		// [문제2]
		//    javaPro\\temp 폴더 삭제. 
		 
		File temp = new File(".\\temp"); 
		directoryDelete(temp);
	     
		System.out.println(" end ");
		

	} // main
	
	private static void directoryDelete(File f) {
		while(  !f.delete() ) {
			// 하위 목록 
		    File[] list =	 f.listFiles();
		    for (int i = 0; i < list.length; i++) {				
		    	if(  list[i].delete() ) {
		    		System.out.printf( "%s 삭제 완료!!!\n", list[i] );
		    	}else {
		    		// 하위 폴더 존재
		    		directoryDelete(list[i]);
		    	} 
			}
		}  
	}

} // class
  