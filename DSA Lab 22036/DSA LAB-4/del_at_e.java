import java.util.Scanner;
public class del_at_e
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
    System.out.print("enter no of elements u want to insert");
    int n=s1.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.print("enter data u want to insert");
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
    tail=head;
    while(tail!=null)
    {
        System.out.println(tail.data);
        tail=tail.next;
    }
 }
 public void delete_from_end()
 {
    Node pre=head;
    tail=head;
    while(tail.next!=null)
    {
        pre=tail;
        tail=tail.next;
    }
    pre.next=null;
 }
public static void main(String[] args)
{
    del_at_e list=new del_at_e();
    list.insertdata();
    list.displaylist();
    list.delete_from_end();
    list.displaylist();
}
}