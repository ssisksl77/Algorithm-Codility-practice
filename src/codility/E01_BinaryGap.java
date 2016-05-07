package codility;

public class E01_BinaryGap {
	public int solution(int N){
		String binary = Integer.toBinaryString(N);
		int i = binary.length()-1;
		//뒤에서 부터 0 이있는 것들은 없앤다. 1이 나올때까지 일단 간다. 그리고 카운트를준비한다.
		
		while(binary.charAt(i)=='0'){
			i--;
		}
		
		int gap =0;
		int counter =0;
		//1이 발견된 후부터 포문이 돌기 때문에 이제 다음 1만 구하면 되는 것이다. 퍼펙트...
		for( ; i>=0 ; i--){
			if(binary.charAt(i)=='1'){
				System.out.println(i);
				gap = Math.max(gap, counter);
				counter = 0;
			} else {
				counter++;
			}
		}
		gap = Math.max(gap, counter);
		return gap;
	}
	public static void main(String[] args) {
		E01_BinaryGap a = new E01_BinaryGap();
		System.out.println("답은 : "+a.solution(15));
		
	}
}
