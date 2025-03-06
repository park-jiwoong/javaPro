package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06_02 {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();

		hm.put("admin", "관리자");
		hm.put("kenik", "이창익"); // 서주원으로 변경
		hm.put("hong", "홍길동");

		System.out.println(hm);

		// 1. 모든 key 출력
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.println(key);
		} // while
		System.out.println("-".repeat(60));

		// 2. 모든 value 출력 //value 값은 중복 되어도 됨 그래서 values 라고 됨
		Collection<String> vs = hm.values();
		ir = vs.iterator();
		while (ir.hasNext()) {
			String value = (String) ir.next();
			System.out.println(value);
		} // while

		// 3. 모든 엔트리( key-value 쌍 ) 출력.
		// value hm.get(key)
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<String, String> entry = eir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s-%s\n", key, value);
		} // while

	}// main

}// class
