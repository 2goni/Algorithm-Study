package class2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 *  문제
	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. 
	(1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

	출력
	한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 *
 */
public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[] list = new int[N+1];

		for(int i=2;i<=N;i++) {
	        list[i] = i;
	    }

	    for(int i=2;i<=N;i++) {
	        if(list[i]==0) {
	        	continue; 
	        }
	        for(int j=2*i; j<=N; j+=i) {
	        	if(list[j]==0) {
		        	continue; 
		        }else {
		        	list[j] = 0;
		        }
	        }
	    }

	    for(int i=M;i<=N;i++) {
	        if(list[i]!=0) {
	        	System.out.println(list[i]);
	        }
	    }
	}
}
