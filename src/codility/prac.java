package codility;


public class prac {
	public static void main(String[] args) {

	}
	 public int[] solution(int N, int[] A) {
		 int[] result = new int[N];
		 int spread = 0;
		 int max =0 ;
		 for( int a : A){
			 if( a == N+1){
				 spread = max;
			 }
			 else if( 1<=a && a<N+1){
				 result[a-1] += Math.max(spread, result[a-1]+1);
				 max = Math.max(max, result[a-1]+1);
			 }
		 }
		 return result;
	 }
	
}
