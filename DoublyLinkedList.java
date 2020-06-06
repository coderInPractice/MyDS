package data_structures;

public class DoublyLinkedList {
	
	Node head;

	class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

		// Add node at start

		public void insert(int data) {

			Node toAdd = new Node(data);
			Node current = head;

			if(head == null) {
				head = toAdd;
			}
			else {
				while(current.next != null) {
					current = current.next;
				}
				current.next = toAdd;

				toAdd.prev = current.next;

			}
		}

		//print 

		public void printAllNodes() {

			Node curr = head;
			while(curr != null){
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
		}
}
