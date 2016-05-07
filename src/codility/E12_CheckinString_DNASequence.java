package codility;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


/* prefixSum은 수열의 구간합을 구하는 것이다. 이 말은 즉슨. 나는 for문을 이중으로 사용해서 O(M*N)인 것에 반해
 *for문을 두번나눠서 사용함으로 O(M+N)이 가능하게 만드는 법이 있다는 것이다. 이 방법은 아주 단순한데
 *첫번째 포문에서 각 더하기의 가짓수를 다 모으는 것이다. 무슨 말이냐면
 *for(int i = 0; i < array1.length; i++){ array는 임의
 *	if(i=0){ sum[i] = array1[i];}
 *	else { sum[i] = sum[i-1] + array1[i];  이게 핵심이다. [0]~[i-1]까지를 더해서 sum배열 한곳에 
 *  쌓는다.
 *  다음 것에서 이런 방법으로 답을 구한 방법을 한 번 보자.
*/
public class E12_CheckinString_DNASequence {
	public static int[] solution(String S, int[] P, int[] Q){
		int[] res = new int[P.length];
		char[] charr = S.toCharArray();
		char[] resString = new char[P.length];
		for(int i =0; i<P.length;i++){
			char pre = 0;
			for(int j = P[i];j<Q[i];i++){
				if(pre == 0){
					pre = charr[j];
				}
				else{
					Math.max(pre, charr[j]);
				}
			}
			resString[i] = pre;
		}
		for(int i =0; i<resString.length; i++){
			res[i] = charToint(resString[i]);
		}
		return res;
	}
	public static int charToint(char pre){
		int res = 0;
		switch(pre){
		case 'A' : {
			res = 1;
		}
		break;
		case 'C' :{
			res = 2;
		}
		break;
		case 'G' :{
			res = 3;
		}
		break;
		case 'F' :{
			res = 4;
		}
		break;
		}
		return res;
	}
	
	public static List<Integer> mapping(char pre){
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 1);
		map.put('C', 2);
		map.put('G', 3);
		map.put('T', 4);
		List<Integer> list = new LinkedList<>();
		switch(pre){
		case 'A':{
			System.out.println("A to"+map.get('A'));
			list.add(map.get('A'));
			break;
		}
		case 'B':{
			System.out.println("B to"+map.get('B'));
			list.add(map.get('B'));
			break;
		}
		case 'G':{
			System.out.println("G to"+map.get('G'));
			list.add(map.get('G'));
			break;
		}
		case 'T':{
			System.out.println("T to"+map.get('T'));
			list.add(map.get('T'));
			break;
		}
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Math.min('A', 'b'));
		
		int[] A = {2,5,0};
		int[] B = {4,5,6};
		solution("CAGCCTA", A, B);
	}
}
