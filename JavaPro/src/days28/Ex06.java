package days28;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author kenik
 * @date 2025. 3. 13. - 오전 11:32:09
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// Stream.of()     배열-> 스트림 변환 메서드
		Stream<Student> st = Stream.of(
				new Student("이자바",3,300),
				new Student("김자바",1, 200),
				new Student("안자바",2, 100),
				new Student("박자바",2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
			);
		// 총점으로 내림차순 정렬
		// st.sorted().forEach(System.out::println);
		
		// 1차 정렬 - 반별로 오름차순 정렬
		// 2차 정렬 - 총점 으로 내림차순 정렬
		st.sorted( 
				 Comparator.comparing( Student::getBan )
				 .thenComparing(Comparator.naturalOrder())
				).forEach(System.out::println);
	

	} // main

} // class

class Student implements Comparable<Student>{
	
	String name;
	int ban;  
	int totalScore;
	
	Student(){}

	public Student(String name, int ban, int totalScore) { 
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	// 기본 정렬은 총점으로 내림차순 정렬
	@Override
	public int compareTo(Student o) {		
		return  Integer.compare(o.totalScore, this.totalScore);
	} 
	
} // class

  