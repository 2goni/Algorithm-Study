package class2;

import java.lang.reflect.Array;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 문제
	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

	입력
	첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 
	다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

	출력
	주어진 수들 중 소수의 개수를 출력한다.
 *
 */
public class Q12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		int count = 0;
		for(int i=0; i<n; i++) {
			list[i] = scanner.nextInt();
		}
		for(int num : list) {
			if(checkPrime(num)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean checkPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
