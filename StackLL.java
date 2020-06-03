package data_structure;

public class StackLL {
	
	MyLinkedList myLL = new MyLinkedList();
	
	public void push (int data) {
		myLL.addNode(data);
	}
	
	
	public void print() {
		
		myLL.printLL();
	}
	
	public int pop() {
		return myLL.removeTail();
	}
	
	public int peek() {
		
		return myLL.peek();
	}

}
