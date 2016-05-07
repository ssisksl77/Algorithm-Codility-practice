package codility;
/**
 * 솔직히 어떻게 했는지 잘 모르겠어 너무 강하다.
 * @author Tom
 *
 */
public class E10_MaxCounters_100100 {
	public static int[] solution(int N, int[] A) {
	       int[] counters = new int[N];
	        int max = 0;
	        int absMax = 0;
	 
	        for (int i=0; i<A.length; i++) {
	            if (A[i] == N+1) {//N+1이 되었을때
	                if ((i < A.length-1 && A[i+1] != N+1) || (i==A.length-1)) {
	                //i가 A의 마지막 주소이고  A[i+1] 이 N+1 또는 i 가 A의 마지막주소값이라면
	                    absMax += max;
	                    max = 0;
	                    counters = new int[N];
	                }
	            } else {
	                counters[A[i]-1]++;
	                if (max < counters[A[i]-1])
	                    max = counters[A[i]-1];
	            }
	        }
	 
	        for (int i=0; i<counters.length; i++)
	            counters[i] += absMax;
	 
	        return counters;
	}
	

	public static void main(String[] args) {
		int[] A = {3,4,1,2,3,5,5};
		int[] a =solution(4, A);
		for(int s : a){
			System.out.println(s);
		}
	}
}
