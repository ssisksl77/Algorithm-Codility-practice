package codility;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

//예제를 대충 보지말자. 이 문제는 N개가 있는데 무조건 1에서 N+1개가 있다는 것이야. 그러면
// getMax가 아니라 getCount로 하는게 맞는 것이었고,
// 거기에 +1도 했어야 한다는 것이지
// 문제를 잘 읽어야 한다.
public class E06_PermmissingElem_100_100 {
	public static int solution(int[] A){
		IntSummaryStatistics B =  IntStream.of(A).summaryStatistics();// A의 전부를 더한 값        
        int C= IntStream.rangeClosed(1, (int)B.getCount()+1).sum();
        return C - (int)B.getSum();
	}
}
