import java.util.Scanner;

public class LinkedList {
	Node head=null;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void insertAtEnd(int val){
		Node newnode=new Node(val);
		Node temp;
		if(head==null)
			head=newnode;
		else{
			temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
		}
	}
	public void insertAtBegin(int val) {
		Node newnode=new Node(val);
		if(head==null)
			head=newnode;
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	public int deleteAtBegin() {
		if(head==null)
			return -1;
		int v=head.data;
		head=head.next;
		return v;
	}
	public int deleteAtEnd() {
		int v;
		Node temp=head;
		Node save=head;
		if(head==null)
			return -1;
		if(head.next==null) {
			v=head.data;
			head=null;
			return v;
		}else {
			while(temp.next!=null) {
				save=temp;
				temp=temp.next;
			}
			v=temp.data;
			save.next=null;
			return v;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	public static void main(String args[]) {
		int choice,val;
		LinkedList ll=new LinkedList();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n\nMenu::\n01. Insert At End\n02. Insert At Begin\n03. Delete at End\n04. Delete at Begin\n05. Display\n06. Exit\nEnter your choice::");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter value::");
				val=sc.nextInt();
				ll.insertAtEnd(val);
			break;
			case 2:
				System.out.println("Enter value::");
				val=sc.nextInt();
				ll.insertAtBegin(val);
			break;
			case 3:
				System.out.println(ll.deleteAtEnd()+" is deleted.");
			break;
			case 4:
				System.out.println(ll.deleteAtBegin()+" is deleted.");
			break;
			case 5:
				ll.display();
			break;
			}
		}while(choice!=6);
	sc.close();
	}
}
