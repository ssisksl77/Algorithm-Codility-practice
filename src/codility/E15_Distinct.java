package codility;

import java.util.Arrays;
// int[] -> List<Integer>
public class E15_Distinct {
	public static int solution(int[] A){
		int a = (int) Arrays.stream(A).distinct().count();

		return a;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,2,4,2,3,1,2,3,2}));
	}
}
