package codility;

import java.util.stream.IntStream;
//returns the minimal positive integer (greater than 0) that does not occur in A.
public class E09_MissingInteger {
	public static int solution(int[] A){
		int[] list= IntStream.of(A).distinct().filter(i -> i>0).sorted().toArray();	
		int minValue = 1;
		for(int i : list){
			if(i ==minValue){
				minValue++;
			}
		}
		return minValue++;
	}
	
	public static void main(String[] args) {
		int[] A = {1};
		solution(A);
	}
}
