import java.util.Scanner;
public class del_at_anypos
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
 public void delete_from_start()
 {
    Node temp=head;
    head=temp.next;
 }
 public void delete_from_anyposition()
 {
    Node pre=head;
    Scanner s1=new Scanner(System.in);
    System.out.print("enter position u want to delete");
    int pos=s1.nextInt();
    tail=head;
    for(int i=0;i<pos-1;i++)
    {
        pre=tail;
        tail=tail.next;
    }
    pre.next=tail.next;
 }
public static void main(String[] args)
{
    del_at_anypos list=new del_at_anypos();
    list.insertdata();
    list.displaylist();
    list.delete_from_anyposition();
    list.displaylist();
}
}