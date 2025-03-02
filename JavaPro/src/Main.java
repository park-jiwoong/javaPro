import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	      
        String fileName = "C:\\Class\\JavaClass\\JavaPro\\src\\days19\\학생명단.txt";
        String saveFileName = "C:\\Class\\JavaClass\\JavaPro\\src\\days19\\SiSt22Class5.html";
        String[][] students = new String[3][6];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String[] studentArray = new String[18]; // 고정 크기 배열
            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < studentArray.length) {
                studentArray[count++] = line;
            }

            // 1차원 배열 -> 2차원 배열 변환
            int index = 0;
            for (int i = 0; i < students.length; i++) {
                for (int j = 0; j < students[i].length; j++) {
                    if (index < count) {
                        students[i][j] = studentArray[index++];
                    } else {
                        students[i][j] = ""; // 빈 값 처리
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(saveFileName))) {
            for (String[] row : students) {
                bw.write(String.join(", ", row));
                bw.newLine();
            }
            System.out.println("파일 저장 완료: " + saveFileName);
        } catch (IOException e) {
            System.out.println("파일 쓰기 오류: " + e.getMessage());
        }
	
	}//main
	
}// class
