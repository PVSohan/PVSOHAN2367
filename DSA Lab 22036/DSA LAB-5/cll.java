import java.util.Scanner;

public class cll {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data you want to insert:");
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        // Make the list circular by setting tail's next to head
        tail.next = head;
    }

    public void insertAtStart() {
        System.out.println("Enter data you want to insert at the beginning:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd() {
        System.out.println("Enter data you want to insert at the end:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;

        }
    }

    public void insertAtAnyPosition() {
        System.out.println("Enter data you want to insert:");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        System.out.println("Enter position you want to insert at:");
        int pos = scanner.nextInt();
        Node newNode = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid position. Position must be positive.");
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        } else {
            Node temp1 = head;
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp1 = temp;
                temp = temp.next;
            }
            temp1.next = newNode;
            newNode.next = temp;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.println("Elements in the list:");
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        cll list = new cll();
        list.insertData();
        System.out.println("List after data insertion:");
        list.displayList();

        list.insertAtStart();
        System.out.println("List after inserting at the beginning:");
        list.displayList();

        list.insertAtEnd();
        System.out.println("List after inserting at the end:");
        list.displayList();

        list.insertAtAnyPosition();
        System.out.println("List after inserting at any position:");
        list.displayList();
    }
}