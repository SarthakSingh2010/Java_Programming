 import java.util.Scanner;

public class MyLinkedList
{
	 Node head;  
	    static class Node //Node class
	    {
	        int data;
	        Node next;
	        Node(int value) //node constructor to create nodes 
	        { 
	            data = value;  
	            next=null; 
	        } 
	    }
	    public void insertAtEnd(int val)
	    {
	        Node newnode = new Node(val);
	        if (head == null)
	        {
	            head = new Node(val);
	            return;
	        }
	        Node temp = head; 
	        while (temp.next != null)
	        {
	            temp = temp.next;
	        }
	        temp.next = newnode;
	    }
	    public int length()
	    {
	        int c=0;
	        Node temp=head;
	        while(temp!=null)
	        {
	            c++;
	            temp=temp.next;
	        }
	        return c;
	    }
	    public void insertAtPosition(int val,int pos)
	    {
	        Node newnode=new Node(val);
	        if(pos>length()||pos<1)
	        {
	            System.out.println("Insert not Possible");
	        }
	        else if(pos==1)
	        insertAtBegin(val);
	        else if(pos==length())
	        insertAtEnd(val);
	        else
	        {
	            Node temp=head;
	            for(int i=1;i<pos-1;i++)
	            temp=temp.next;
	            Node temp1=temp.next;
	            temp.next=newnode;
	            newnode.next=temp1;
	        }
	    }
	    public void insertAtBegin(int val)
	    {
	        Node newnode = new Node(val);
	        if(head==null)
	        {
	            head=new Node(val);
	            return;
	        }
	        newnode.next = head;
	        head = newnode;
	    }
	    public void display()
	    {
	        Node temp;
	        temp=head;
	        while(temp!=null)
	        {
	            System.out.print(temp.data+" --> ");
	            temp=temp.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args)
	    {
	        int c,item,pos;
	        Scanner sc=new Scanner(System.in);
	        MyLinkedList lis = new MyLinkedList();
	        do
	        {
	            System.out.println("MENU::");
	            System.out.println("1. InsertATEnd\n2. InsertATFront\n3. InsertAtPos\n4. Length\n5. Display\n6. Exit\nEnter your choice:");
	            c=sc.nextInt();
	            switch(c)
	            {
	                case 1:
	                    System.out.println("Enter value:");
	                    item=sc.nextInt();
	                    lis.insertAtEnd(item);
	                break;
	                case 2:
	                    System.out.println("Enter value:");
	                    item=sc.nextInt();
	                    lis.insertAtBegin(item);
	                break;
	                case 3:
	                    System.out.println("Enter value and pos:");
	                    item=sc.nextInt();
	                    pos=sc.nextInt();
	                    lis.insertAtPosition(item,pos);
	                break;
	                case 4:
	                    System.out.println("Lenght is: "+lis.length());
	                break;
	                case 5:
	                    System.out.println("Display:");
	                    lis.display();
	                break;
	            }
	        }while(c!=6);
	        sc.close();
	    }
}
