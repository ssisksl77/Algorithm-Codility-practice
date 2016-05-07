package codility;

import java.util.stream.IntStream;

public class E05_TapeEquilibirum_crrect100_performance100 {
	public static int solution(int[] A){
		int b = IntStream.of(A).sum();
        int a = 0;
        int diff=0;
        int MIN = Integer.MAX_VALUE;
        for(int i = 0; i<A.length-1; i++){
            a = a + A[i];
            b = b - A[i];
            diff = Math.abs(b - a);
            if (diff < MIN){
                MIN = diff;
            }
        }
        return MIN;
	}
	public static void main(String[] args) {
		//답변은 long으로 되어 있었다. 왜 그런 거지?? 왜 인트끼리 비교 하면 안되는건가??
		//와 대단하다 이거 100점 나옴.
	}
}
