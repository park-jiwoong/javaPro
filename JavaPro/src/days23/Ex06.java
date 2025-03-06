package days23;

import java.util.HashMap;
import java.util.Map;

public class Ex06 {

	public static void main(String[] args) {
		// map
		/*
		 * 1. 키(key) - 값(value) 쌍으로 데이터를 저장하는 구조
		 * 		엔트리 (Entry) 데이터 효율 검색 삭제 O
		 * 
		 * 2. 같은 키(key)는 중복을 허용하지 않음
		 * 3. Map 인터페이스를 구현한 클래스
		 * 		HashMap: 빠름 검색 기능 제공 (가장 많이 쓰는) ⓐ 구 버전	웹 인터페이스	예(ArrayList) StringBuilder 
		 * 		hashTable : 멀티스레드에서 안전하게 사용	ⓑ 신 버전					예(Vector)	StringBuffer
		 * 		Hash - 헤싱이라는 기법을 사용해서 데이터를 저장 → 검색 성능 뛰어나다
		 * 
		 * 		해싱기법 - 해시함수(hash_function)을 이용해서 데이터를 해시테이블 (hash table)에 저장하고 검색하는 기법
		 *				- 해시함수는 데이터가 저장되어 있는 곳을 알려 주기 때문에 다량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있다
		 * 
		 * 		TreeMap: 정렬된 순서로 키(key) 저장	(내부적으로 이진 검색 트리 BST 사용해서 저장) 검색, 정렬
		 * 		LinkedHashMap: 삽입된 순서대로 항목이 유지되는 Map ← 삽입 순서 유지 ★	순서 유지
		 * 		
		 * 
		 */
		
		//<[K]ey, [V]alue> 동시에 가져올 때 = Entry 라고 말함
		//	id		mame
		HashMap<String, String> hm = new HashMap<>();
		//LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		hm.put("admin", "관리자");
		hm.put("kenik", "이창익"); // 서주원으로 변경
		hm.put("kenik", "서주원");
		hm.put("hong", "홍길동");
		// 순서 유지 X
		//{hong=홍길동, kenik=이창익, admin=관리자}
		System.out.println(hm);
		
		// 검색, 수정, 삭제 - [key],value
		// "kenik" 키 를 찾는 작업
		//boolean hm.containsKey("kenik");
		//boolean hm.containsValue("이창익");
		
		//indexof() X 같은 메서드는 행 찾는 건 없음
		
		if (hm.containsKey("kenik") ) {
			//엔트리 (Entry)
			//String value = hm.get("kenik");
			//System.out.println(value);
		
			hm.put("kenik", "서주원");	
			//hm.replace(null, null);
		}//if
		
		//System.out.println(hm);
		//hm.clear();
		

		hm.put("park", "서주원");
		hm.put(null, null);
		hm.put(null, "널");
		
		//null 키의 엔트리 삭제
		hm.remove(null); // 삭제된 엔트리의 Value 값
		
		System.out.println(hm);
		
		//String value = hm.get("abc");
		String value = hm.getOrDefault("abc", "익명"); //정해진 키값이 없으면 null 말고 "익명을 반환 하라"
		System.out.println(value);	//null
		
		//merge()병합 메서드 value만 병합함
		Map<String, Integer> map = new HashMap<>(); 
        
        // 초기 데이터 추가
        map.put("apple", 1);
        map.put("banana", 2);
        
        // merge() 메서드 사용 예
        map.merge("apple", 3, (oldValue, newValue) -> oldValue + newValue);  // 기존 값 + 새 값
        map.merge("banana", 1, (oldValue, newValue) -> oldValue + newValue); // 기존 값 + 새 값
        map.merge("cherry", 5, (oldValue, newValue) -> oldValue + newValue); // cherry는 처음 등장
        
        System.out.println(map);
	}//main

}//class
