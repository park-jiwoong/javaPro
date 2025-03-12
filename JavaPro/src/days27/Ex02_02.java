package days27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author kenik
 * @date 2025. 3. 12. - 오전 9:45:44
 * @subject 
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kbs", "mbc","sbs", "jtbc");
		System.out.println( list );
		// [kbs, mbc, sbs, jtbc]  내림차순으로 정렬
//		Collections.sort(list, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		} );
		
		Collections.sort(list, ( o1,  o2) -> o2.compareTo(o1)	 );
		
		
		System.out.println( list );

	}

}
  