package days23;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * Student 클래스 → HashSet 컬렉션 클래스 저장
 *	[문제점] 파악 → 해결.
 *				hashCode() 오버라이딩 - 학번이 같으면
 *				학생 비교 eqauls() 오버라딩 - 학번
 */
public class Ex03 {

	public static void main(String[] args) {

		HashSet<Student> hs = new HashSet();
		
		hs.add(new Student("2020001", "홍길동", 25));
		hs.add(new Student("2020002", "서영학", 25));
		hs.add(new Student("2020003", "최승우", 25));
		hs.add(new Student("2020001", "권태정", 25));
		
		// 반복자로 출력
		java.util.Iterator<Student> ir = hs.iterator();
		
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		
		}//while
		
	}//main



}//class

class Student{
	String no; //학번 - 학생을 구별할 수 있는 고유한 필드
	String name;
	int age;
	
	public Student() {
		super();
	}

	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.no.hashCode(); //학번이 정수 Integer로 반환 되서 바뀌는 것 no
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student && obj != null) {
			Student s = (Student)obj;
			return this.no.equals(s.no);
		}
		return false;
	}
	
}//Student