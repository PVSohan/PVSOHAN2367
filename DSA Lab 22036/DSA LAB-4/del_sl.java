import java.util.Scanner;
public class del_sl
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
    System.out.print("enter no of elements u want to insert ");
    int n=s1.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.print("enter data u want to insert ");
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
    if(head==null)
    {
        System.out.println("list is empty");
    }
    tail=head;
    while(tail!=null)
    {
        System.out.println(tail.data);
        tail=tail.next;
    }
 }
 public void delete_from_start()
 {
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else
    {
        tail=head;
        head=tail.next;
    }
 }
 public void delete_from_end()
 {
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else
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
 }
 public void delete_from_anyposition()
 {
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else
    {
        Node pre=head;
        tail=head;
        Scanner s1=new Scanner(System.in);
        System.out.print("enter position u want to delete ");
        int pos=s1.nextInt();
        if(pos==1)
        {
            head=tail.next;
        } 
        else
        {
            for(int i=0;i<pos-1;i++)
            {
                pre=tail;
                tail=tail.next;
            }
            pre.next=tail.next;
        }
    }
 }
 public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    del_sl list = new del_sl();
    int choice = 0;
    int exit_cond;
    do {
        System.out.print("Enter choice (1)insert data (2)delete from start, (3)delete from end, (4)delete from any position, (5)display (5)exit: ");
        choice = s1.nextInt();
        switch (choice) {
            case 1:
                list.insertdata();
                break;
            case 2:
                list.delete_from_start();
                break;
            case 3:
                list.delete_from_end();
                break;
            case 4:
                list.delete_from_anyposition();
                break;
            case 5:
                list.displaylist();
                break;
            case 6:
                System.out.println("thank you");
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
        System.out.print("Do you want to continue? Press 1 if yes or press 0: ");
        exit_cond = s1.nextInt();
    } while (exit_cond == 1);
}
}
    