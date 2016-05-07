package codility;

import java.util.Arrays;
//-만 있는 경우도 생각해보자.
public class E16_MaxProductThree {
	public static int solution(int[] A) {
		Arrays.sort(A);
		int tmpmax = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		if(A[A.length-1]>=0){
			for(int i = 0; i+2<A.length;i++){
				tmpmax =A[i]*A[i+1];
				if(tmpmax > max){
					max = tmpmax;
				}
			}
			return max*A[A.length-1];
		}
		else if(A[A.length-1]<0){
			for(int i = 0; i+2<A.length;i++){
				tmpmax = A[i]*A[i+1];
				if(tmpmax < min){
					min = tmpmax;
				}
			}
			return min*A[A.length-1];
		}
		return 0;
	}
	public static void main(String[] args) {
		int a = solution(new int[] {-5, -6, -4, -7, -10});
		System.out.println(a);
	}
}
