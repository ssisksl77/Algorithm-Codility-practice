package codility;
//내가 푼건데 100퍼다
//처음꺼가 엄청 어려운 것인듯
public class E02_CyclicRotation {
	   public int[] solution(int[] A, int K) {
	        int length = A.length;
	        int[] a = new int[length];
	        // 속여 생각했는데 널이나 1 짜리를 주니까 퍼센트가 올라갈줄이야...
	        if(A == null || length == 1 ){
	            return A;
	        }
	        
	        for(int i =0; i<length; i++){
	            if(i+K > length-1){
	                //K가 빼기 한번 해서 될 것이라는 생각은 버려
	            	a[((i+K)%length)] = A[i];
	            }
	            else{
	                a[i+K] = A[i];
	            }
	        }
	        return a;
	    }
}
