
public class Stack {

	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(1);
		stk.push(3);
		stk.push(5);
		int pop = stk.pop(); // 5
		int top = stk.stackTop(); // 3
		System.out.println(pop);
		System.out.println(top);
	}

	private Node top;
	private int count;
	
	public Stack() {
		this.top = null;
		this.count = 0;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = this.top;
		this.top = node;
		this.count ++;
	}
	
	public int pop() {
		if (this.count == 0) {
			System.out.println("no data in stack!");
		}
		Node node = this.top;
		this.top = node.next;
		this.count --;
		return node.data;
	}
	
	public int stackTop() {
		return this.top.data;
	}
}

class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}