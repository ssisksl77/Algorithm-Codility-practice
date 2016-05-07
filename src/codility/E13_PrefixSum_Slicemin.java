package codility;

import java.util.Arrays;

public class E13_PrefixSum_Slicemin {
	public static int solution(int[] A){
		if(A.length <= 2 ){
			return 0;
		}
		Arrays.parallelPrefix(A,(a1, a2)-> a1+a2);
		double minvalue =  Math.min(A[1]/2.0, A[2]/3.0);
		int index=0;
		double avg = 0.0;
		int sum =0;
		for(int i = 1; i+1<A.length;i++){
			sum = A[i+1] - A[i-1];
			avg = sum / 2.0;
			if(avg < minvalue){
				minvalue = avg;
				index = i;
			}
			
			if(i+2 < A.length){
				sum = A[i+2] - A[i-1];
				avg = sum / 3.0;
			}
			if(avg < minvalue){
				minvalue = avg;
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int a  = solution(new int[] {4, 2, 2, 5, 1, 5, 8,1,9,1,9,4,56,6,4,5,6,7});
		System.out.println(a);
	}
}
