package codility;

public class E10_MaxCounters_00 {
	public static int[] solution(int N , int[] A ){
		int[] res = new int[N];
		int max = 0;
		int last_max = 0;
		for(int i = 0; i<A.length; i++){
			int cur= A[i];
			if(cur == N+1){
				//문제가 있는데 Arrays.fill이 문제가 있다고 한다. 여기에 걸릴때마다 계속 다 하기 때문이다.
				last_max = max;
			}else{
				//그래서 그 해결책은 변화할 때마다 다 바꾸는게 아니라. list_max(Arryas.fill)한 값보다 작을 때만
				//그.것.만 바꾸는 거다.
				res[cur-1] = Math.max(last_max, res[cur-1])+1;
				max = Math.max(max, res[cur-1]);
			}
		}
		//그리고 나중에 한번더 쫙 해준다.
		for(int i = 0 ; i<res.length;i++){
			res[i] = Math.max(res[i], last_max);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] A = {3,4,1,2,3,5,5};
		int[] a =solution(4, A);
		for(int s : a){
			System.out.println(s);
		}
	}
}
