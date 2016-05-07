package linkedlist;

import java.util.Stack;

public class ex03 {
	public static void main(String[] args) {
		System.out.println("dd");
		int n = 3;
		Tower[] towers = new Tower[n];
		// 타워 초기와?
		// tower[0] = new Tower(0);
		// tower[1] = new Tower(1);
		// tower[2] = new Tower(2);
		// 타워 배열을 만들었다.
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
			// towers[0].add(2);
			// towers[0].add(1);
			// towers[0].add(0);
			// 원판을 타워0에 2 1 0 순으로 넣었다.
		}
		// tower[3].moveDisk(3, towers[2], towers[1]);
		// 뭐지 이게 뭐지. 디스크를 움직이는데
		// tower[0]에 있는 원판 3개를 tower[1]을 버퍼로 생각하고 tower[2]로 움직인다.
		towers[0].moveDisk(n, towers[2], towers[1]);
		
	}
}

class Tower {
	static int ii = 0;
	private Stack<Integer> disks;
	private int index;

	public Tower(int i) {
		disks = new Stack<Integer>();
		index = i;
	}
	public void moveDisk(int n, Tower destination, Tower buffer) {
		if (n > 0) {
			// 세번째 탑을 버퍼로 사용하여 위 n-1개 원반을 #1에서 #2로 이동
			// 남은 원반을 출발지에서 목적지로 옮긴다.
			// 버퍼에 있는 모든 원반을 목적지로 옮긴다.

			moveDisk(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisk(n - 1, destination, this);
		}
	}
		//n=3일때는
		//n=2일때 옮기는 걸로 버퍼에 옮긴다. 그런 다음 한 원판을 목적지에 옮긴다. 그리고 버퍼에 있는 것을  목적지에 옮긴다. 
		//n=2일때 옮기는 건
		//n=1일때 옮기는 걸 버퍼에 옮긴다.(하나) 그리고 나머지를 목적지에 옮긴다.(바닥에 놓을판) 그리고 버퍼에 있는 것을 목적지에 옮긴다.
//		그렇다면 n=3 내려갔다면 일때 버퍼가 1 목적지가 2
//		n=3 이동은
//		 1.moveDisk(2,1,2) 목적지를 버퍼로 취급하여 버퍼에 n=2를 넣고
//		 2.남아있는 하나를 des에 넣고
//		 3.버퍼에 있는 n=2값을 목적지에 넣는다.
//		n=2이동은 moveDisk(1,2,1)이다.
//		 1. moveDisk(1,2,1)
//		 2. 남아있는 하나를 역시 옮기고 
//		 3. 버퍼에 있는 것을 목적지에 넣는다.
//		n=1이동은 moveDisk(0,1,2)
//		 1. 사실 moveDisk는 하는 일이 없다. 여기서 끝이다.재귀적으로 불러내야 하는데 리턴이 null이거나 더 재귀를 안하면 이제 할 일을 하는 듯하다.
//		 2. 목적지에 넣는 것이긴 하지만 전에 불렀던 n=2의 버퍼이다. 버퍼로 움직이는 것이다. 그래서 toTop(2)
//		 3. 그리고 버퍼에서 부르는 것은 불러지지 않는다. n=0은 불려지지 않는다.
//		 그래서 0 ->2로 끝남
//		 
//		다시 이제 돌아온다.
//		n=2는 
//		1. 1.0->2(실행함)
//		2. 그리고 totOP으로 0->1 실행후
//		3. 버퍼(2)에서 1로 움직임
//		n=3은 그 반복

	public int index() {
		return index;
	}

	public void add(int d) {
		// disks스택이 비어있지 않고 디스크의 마지막 값이 현재 값보다 같거나 작으면 디스크에 문제가 있는 것임
		// d가 지금 디스크의 마지막 크기보다 크면 안된다. 하노이탑 규칭임
		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk " + d);
		} else {
			disks.push(d);
		}
	}
	public void moveTopTo(Tower t) {
		// 디스크의 값을 빼서 가야할 곳에 보냅니다.
		int top = disks.pop();
		t.add(top);
		System.out.println(this.index+"index :: " + "move Disk " + top +" from "+ index() +" to "+t.index
				+" , ii = "+ ii++ );
	}
}
