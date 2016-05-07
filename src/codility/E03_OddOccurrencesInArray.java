package codility;
//페어가 없는 것 홀수로 있는 것을 거르는 것이다. 짝이 있으면 둘씩 없애고 남는 것을 리턴한다.
//^는 XOR인듯 같은 것은 0 으로 바꾸고 다를 때만 1
public class E03_OddOccurrencesInArray {
	public int solution(int[] A){
		int result = 0;
		for(int a : A){
			result ^= a;
		}
		return result;
	}
}
