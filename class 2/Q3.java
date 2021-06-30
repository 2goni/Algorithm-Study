package class2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *  문제
	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
	1. 길이가 짧은 것부터 
	2. 길이가 같으면 사전 순으로
	
	입력
	첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

	출력
	조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 *
 */
public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});
		for(int i=0; i<size; i++) {
			String tmp = scanner.next();
			if(!pq.contains(tmp)) {
				pq.offer(tmp);
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
