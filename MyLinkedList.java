package data_structure;

public class MyLinkedList {
	
	Node head;
	
	public class  Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	// Add new node at tail
	public void addNode(int data) {
		Node newNode =  new Node (data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
	}
	
	// print
	
	void printLL () {
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	
	//remove from tail
	
	int removeTail() {
		Node current = head;
		
		if(current == null) {
			System.out.println("List is already empty");
		}
		
		if(current.next == null) {
			current = null;
			System.out.println("Head is deleted");
		}
		
		while(current.next.next != null) {
			current = current.next;
		}
		Node toremove = current;
		current.next = null;
		
		return toremove.data;
	}
	
	public int peek() {
		
		Node current  = head;
		while(current.next != null) {
			current = current.next;
		}
		
		return current.data;
	}
	
	// add new node at given position
	public void addNode(int pos, int data) {
		Node addNode = new Node(data);
		
		if(head == null) {
			addNode(data);
		}
		
		//int count = 0;
		Node current = head;
		while(--pos != 0) {
			
			current = current.next;
			//count++;
			
		}
		addNode.next = current.next;
		current.next = addNode;
	}
	
		// remove node from given pos
	public void remove(int pos) {
		Node current = head;
		
		while(--pos != 0) {
			current = current.next;
		}
		current.next = current.next.next;
	}
	
	}

