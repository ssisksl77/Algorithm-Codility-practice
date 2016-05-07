package codility;

import java.util.Arrays;
import java.math.*;
public class E05_corre100_speed0 {
    public static int solution(int[] A) {
        int a_sum=Arrays.stream(A).limit(1).sum();
        int b_sum=Arrays.stream(A).skip(1).sum();
        int min = Math.abs( b_sum-a_sum );
        for(int i = 1; i< A.length; i++){
			a_sum = Arrays.stream(A).limit(i).sum();
			b_sum = Arrays.stream(A).skip(i).sum();
			int tmp = Math.abs(b_sum-a_sum);
			if( min > tmp ){
			    min = tmp; 
			}
		}
        return min;
    }
    public static void main(String[] args) {
    	
    	//sumOfArray랑 subarray라는게 있나.??? copyofarry는 있는데
    	
    	
    	int[] A = new int[10000];
    	for(int i = 0; i<10000;i++){
    		A[i]=i;
    	}
    	long a = System.currentTimeMillis();
		System.out.println(solution(A));
		long b = System.currentTimeMillis();
		System.out.println(b-a);
	}
    
}
