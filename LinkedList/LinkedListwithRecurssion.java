package LL;

public class RecursLinkedL {
	Node head;
   public class Node {
	   int data;
	   	Node next;
	   	public Node(int data) {
	   		this.data = data;
	   	}
		public Node(int data , Node next) {
	   		this.data = data;
	   		this.next = next;
	   	}
		
   }
   
   public void insertAtIndex(int index, int data) {
       head = insert(head, index, data);
   }

   
   
   private Node insert(int index) {
       if (index < 0) {
           System.out.println("Index out of bounds");
           return head;
       }
       if (index == 0) {
           Node newNode = new Node(data);
           newNode.next = head;
           return newNode;
       }
       if (head == null) {
           System.out.println("Index out of bounds");
           return null;
       }
       head.next = insert(head.next, index - 1, data);
       return head;
   }
	    
		   
	   }
   }
   
   
	

	public static void main(String[] args) {
		RecursLinkedL List = new RecursLinkedL();
		List.insert(6);
		

	}

}}
