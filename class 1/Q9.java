import java.util.Arrays;
import java.util.Scanner;

/**
 * 	문제
	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

	입력
	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

	출력
	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
	
	예제
	    *
	   **
	  ***
	 ****
	*****
 *
 */
public class Q9 {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int num = scanner.nextInt();
    	String star = "*";
    	String blank = "";
    	for(int i = 0; i < num-1; i++) {
    		blank += " ";
    	}
    	for(int j = num; j > 0 ; j--) {
    		System.out.print(blank);
    		System.out.println(star);
    		blank = blank.replaceFirst(" ","");
    		star += "*";
    	}
    }
}
