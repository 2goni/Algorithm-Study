package class2;

import java.util.Scanner;

/**
 * 문제
	한수는 지금 (x, y)에 있다. 
	직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
	직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 x, y, w, h가 주어진다.

	출력
	첫째 줄에 문제의 정답을 출력한다.
 *
 */
public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int min = Math.min(w/2, h/2);
		for(int i=0; i<4; i++) {
			min = Math.min(Math.abs(0-x),min);
			min = Math.min(Math.abs(0-y),min);
			min = Math.min(Math.abs(w-x),min);
			min = Math.min(Math.abs(h-y),min);
		}
		System.out.println(min);
	}
}
