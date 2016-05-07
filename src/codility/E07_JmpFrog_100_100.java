package codility;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*또다른 천재의 답 (명확하다)
public int solution(int X, int[] A) {
    HashSet<Integer> hset = new HashSet<Integer>();

    for (int i = 0 ; i < A.length; i++) {
        if (A[i] <= X)
           hset.add(A[i]);   
        if (hset.size() == X)
           return i;
    }

    return -1;
}
*/



public class E07_JmpFrog_100_100 {
	public static int slution(int X, int[] A){
		//이게 개구리가 5까지 가려면 1,2,3,4,5 값이 있어야 한다.
		//배열이 1,2,3,4,5가 최소 다 모이는 곧 까.지.가서 위치를 보관했다가 그걸 보여주는 거지
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<A.length;i++){
			if(A[i] <= X){
				if(map.containsKey(A[i])){
					if(map.get(A[i])>i){
						map.put(A[i], i);
					}
				}else{
					map.put(A[i],i);
				}
			}
		}
		int pre = 0;
		for(int j = 1; j<=X;j++){
			if (!map.containsKey(j)){
				return -1;
			}
			if(pre < map.get(j)){
				pre = map.get(j);
			}
		}
		return pre;
	}

	/*이건 틀린 거지만 atomicInteger 사용법에 대해 나온다. filter에 걸리는 것만 카운트 하기 좋다.*/
	public static int solution2(int X, int[] A){
		AtomicInteger atomicInteger = new AtomicInteger(0);
		IntStream.of(A).forEachOrdered(i -> {
			if(i <= X){
				atomicInteger.getAndIncrement();
			}
			});
		System.out.println(atomicInteger.get());
		return atomicInteger.get();
	}

	public static int solution3(int X, int[] A){
		int res = 0;
		
		return res;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] A = {3,2,1,0,0,0,0,0,0};
//		System.out.println(slution(3, A));
		solution2(2, A);
	}

}
