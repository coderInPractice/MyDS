package data_structure;

public class Stack_Array {
	
	int[] stack = new int[4];
	int top = 0;
	
	public void push(int data) {
		
		stack[top] = data;
		top++;
	}
	
	public void print() {
		
		for(int e : stack) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public int pop() {
		
		int data ;
		top--;
		data = stack[top];
		
		stack[top] = -1;
		
		return data;
		
	}
	
	public void topValue() {
		System.out.println(top);
	}

}
