import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 	문제
	자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

	출력
	첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 *
 */
public class Q16 {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int num = scanner.nextInt();
    	for(int i=1; i<=num; i++) {
    		System.out.println(i); 
    	}
    }
}
