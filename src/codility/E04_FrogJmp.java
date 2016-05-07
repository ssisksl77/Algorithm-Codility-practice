package codility;
//100%
//X에서 Y를 넘거나 도달했때 D만큼 점프할때 번수... 모드가 0 일때와 차이가 0일때와 
// gap이 D보다 작아도 mod때문에 +1이 된다. 괜찮은 접근법이다. 그러니 mod와 gap이 0일때를 조심한다.


//한줄 요약 : mod와 gap이 0일때를 조심한다.
public class E04_FrogJmp {
	public int Solution(int X, int Y, int D){
		int gap = X - Y;
		if (gap ==0) {return 0;}
		
		int mod = gap & D;
		if(mod != 0) { return gap/D + 1;}
		else {return gap/D;}
	}
}
