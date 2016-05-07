package codility;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class E11_modmod {
	public static int solution(int A, int B, int K){
		/*int res = 0;
		res = (int) IntStream.rangeClosed(A, B).filter(k -> k%K == 0).count();
		return res;
		50점짜리  ::: 100correct, 0performance
		*/
		
		return (B==0) ? 1 : B/K + ( (A==0) ? 1 : (-1)*(A-1)/K);
		//이게 100/100 인데 정말 뭐지
		//B==0 이면 1이다. 아니면 B/K + 
		//A==0이면 1이다. 아니면 (-1)*(A-1)/K 무슨말이지 이게....
		//B==0이면 1 A==0 이면 1 B==0이면 그냥 1인데 말이되나.아무것도 없어야 하는거 아닌가.
		
	}
	public static void main(String[] args) {
		
		System.out.println(solution(0, 0, 2));
	}
}

