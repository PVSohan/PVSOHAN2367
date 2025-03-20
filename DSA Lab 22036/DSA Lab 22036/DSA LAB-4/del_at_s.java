import java.util.Scanner;
public class del_at_s
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
 public void displaylist()
 {
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
 }
 public void delete_from_start()
 {
    Node temp=head;
    head=temp.next;
 }
public static void main(String[] args)
{
    del_at_s list=new del_at_s();
    list.insertdata();
    list.displaylist();
    list.delete_from_start();
    list.displaylist();
}
}