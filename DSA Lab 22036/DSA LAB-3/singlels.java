import java.util.Scanner;
public class singlels
{
    class Node
 {
        int data;
        Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
 }
 public Node head=null;
 public Node tail=null;
 public void insertdata()
 {
    Scanner s1=new Scanner(System.in);
    System.out.println("enter no of elements u want to insert");
    int n=s1.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.println("enter data u want to insert");
        int data=s1.nextInt();
        Node newNode=new Node(data);
        if(head == null)
    {
        head=newNode;
        tail=newNode;
    }
    else
    {
        tail.next=newNode;
        tail=newNode;
    }
    }
 }
 public void insert_at_start()
 {
    System.out.println("enter data u want to insert");
    Scanner s1=new Scanner(System.in);
    int data=s1.nextInt();
    Node newNode=new Node(data);
    Node temp=head;
    newNode.next=temp;
    head=newNode;
 }
 public void insert_at_end()
 {
    System.out.println("enter data u want to insert");
    Scanner s1=new Scanner(System.in);
    int data=s1.nextInt();
    Node newNode=new Node(data);
    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newNode;
 }
 public void insert_At_anyposition()
 {

    System.out.println("enter data u want to insert");
    Scanner s1=new Scanner(System.in);
    int data=s1.nextInt();
    Node newNode=new Node(data);
    System.out.println("enter position u want to insert");
    int pos=s1.nextInt();
    Node temp=head;
    Node temp1=head;
    for(int i=0;i<pos;i++)
    {
        temp1=temp;
        temp=temp.next;
    }
    temp1.next=newNode;
    newNode.next=temp;
 }
 public void displaylist()
 {
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
 }
public static void main(String[] args)
{
    singlels list=new singlels();
    list.insertdata();
    list.displaylist();
    list.insert_at_start();
    list.displaylist();
    list.insert_at_end();
    list.displaylist();
    list.insert_At_anyposition();
    list.displaylist();
}
}