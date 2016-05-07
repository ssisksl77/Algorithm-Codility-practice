package linkedlist;

import java.util.Stack;

//두 개의 스택을 사용하여 큐를 구현하는 MyQueue 클래스를 작성해보라.
/**
 * 큐와 스택의 주된 차이는 순서다.(먼저 들어간 것이 나오느냐, 자미막에 들어간 항목이 나오느냐). 순서를 뒤집으려면 peek()과
 * pop()의 구현을 변경하여야 한다. 두 번째 스택을 사용하면 저장된 항목들의 순서를 뒤집을 수 있다.
 * (s1으로부터 pop한 항목을s2에 push하면 된다.)
 * (
 * @author Tom
 *
 */
public class MyQueue<T> {
	Stack<T> stackNewest, stackOldest;
	
	public MyQueue() {
		stackNewest = new Stack<>();
		stackOldest = new Stack<>();
	}
	
	public int size() {
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(T value){
		/* stackNewest에 push한다. 이 스택은 항상
		 * 최신 원소를 최상단에 유지한다.
		 */
		stackNewest.push(value);
	}
	/*원소들을 stackNewest에서 stackOldest로 옮긴다.
	 * stackOldest에 대해 작업을 계속할 수 있도록 만들기 위해서다.
	 */
	private void shiftStacks()	{
		if(stackOldest.isEmpty()){
			while (!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek() {
		shiftStacks(); // stackOldest가 현재 항목들을 보관하도록 보장
		return stackOldest.pop(); //가장 오래된 항목 보여줌
	}
	public T remove() {
		shiftStacks(); //stackOldest가 현재 항목들을 보관하도록 보장
		return stackOldest.pop(); //가장 오래된 항목을 보여줌
	}
}
