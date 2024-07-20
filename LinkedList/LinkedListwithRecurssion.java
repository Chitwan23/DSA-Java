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

   
   
   private Node insert(Node head, int index , int data) {
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
	    
   public void displaydata() {
	   display(head);
	   System.out.print("END");
   }
   public void display(Node head) {
	   if(head==null) {
		   return ;
	   }
	   System.out.println(head.data +"->");
	  
	   display(head.next);
   }
		   
	   
   
   
   
	

	public static void main(String[] args) {
		RecursLinkedL List = new RecursLinkedL();
		List.insertAtIndex(1,8);
		List.insertAtIndex(2, 6);
		List.insertAtIndex(0, 7);
		List.displaydata();
		

	}

}
