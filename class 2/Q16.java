package class2;

import java.util.Scanner;

/**
 * 문제
	두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

	출력
	첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 *
 */
public class Q16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int max = Integer.max(n, m);
		int min = Integer.min(n, m);
		
		int gcd = min;
		while(true) {
			if(max%gcd == 0) {
				System.out.println(gcd);
				break;
			}
			min = max;
			max = gcd;
			gcd = min%gcd;
		}
		System.out.println(n*m/gcd);
	}
}
