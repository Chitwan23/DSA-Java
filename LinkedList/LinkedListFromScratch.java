package LL;
public class Linkedlist {
	Node Head;
	int size;
	 
	public class Node {
		int data;
		Node next; 
	
	public Node(int data) {
		this.data = data;
	}
	public Node(int data , Node next) {
		this.data = data;
		this.next = next;
		
	}}
	
	public void insert(int data) {
		Node node = new Node( data);
		if (Head ==null) {
		Head = node;
		size++;
		return;}
	 Node temp = Head;
	 while(temp.next!=null) {
		 temp = temp.next;
	 }
	 temp.next = node;
	 size++;
		
	}
	
	public void display() {
		if (Head== null) {
			System.out.println("list is empty");
		}
	
		Node temp = Head;
	  while(temp!=null) {
		System.out.print(temp.data + "-> ");
		temp =temp.next;
	}
	  System.out.print("END");
	}
	
	public void delete(int index) {
		if (Head== null) {
			System.out.print("list is empty");
			return;
		}
		else if (index==0) {
			Head=Head.next;	
			return;
		}
		Node temp = Head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }
	
	public void InsertatIndex(int index, int data) {
		Node node = new Node( data);
		if (Head == null) {
			System.out.println("String Empty");
		}
		 if (index == 0) {
	            node.next = Head;
	            Head = node;
	        } 
		 else {
		Node temp= Head;
		for(int i =0; i<index-1;i++ ) {
			temp= temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size--;}
		
	}
	
	public static void main(String args[]) {
		Linkedlist list = new Linkedlist();
		list.insert(1);
		list.insert(3);
		list.insert(5);
		list.insert(7);
		list.display();
		list.delete(0);
		System.out.println();
		list.display();
		list.insert(2);
		list.insert(8);
		System.out.println();
		list.display();
		list.delete(3);
		list.InsertatIndex(4, 99);
		list.InsertatIndex(0, 6);
		System.out.println();
		list.display();
	}

}
