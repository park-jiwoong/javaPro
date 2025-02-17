package days09;

public class Ex01 {

	public static void main(String[] args) {
		//6. 1~100 까지의 소수의 합
		//  (1+)2+3+5+7+...97=???
		// 소수 (Prime number) : 1볻다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수.
		//
				int sum = 0;
				for (int i = 1; i < 100; i++) {
					if (isPrimeNumber(i)) {
						System.out.printf("%d+", i);
						sum += i;
					}
				}
				System.out.println("%d, sum");
			}// main

	private static boolean isPrimeNumber(int i) {
		return false;
	}
		}// class 