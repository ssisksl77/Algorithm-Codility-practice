package codility;

import java.util.Arrays;

public class E08_permutationtest_100_100 {
	public static int solution(int[] A) {
		Arrays.sort(A);
		for(int i = 0; i<A.length ; i++){
			if((i+1) != A[i]) return 0;
		}
		return 1;
	}


	
	
	
	
	
	public static void main(String[] args) {

	}
}
