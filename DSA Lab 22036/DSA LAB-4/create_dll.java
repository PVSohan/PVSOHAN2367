import java.util.Scanner;

public class create_dll {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public Node head, tail, temp, temp1, temp2 = null;

    public void insertData() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of elements you want to insert: ");
        int n = s1.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data you want to insert: ");
            int data = s1.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insertAtStart() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter data you want to insert at the beginning: ");
        int data = s1.nextInt();
        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter data you want to insert at the end: ");
        int data = s1.nextInt();
        Node newNode = new Node(data);
        tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        newNode.prev = tail;
        tail.next = newNode;
    }

    public void insertAtAnyPosition() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter position you want to insert: ");
        int pos = s1.nextInt();
        System.out.print("Enter data you want to insert at the required position: ");
        int data = s1.nextInt();
        Node newNode = new Node(data);
        if (pos == 1) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            temp = temp1 = head;
            for (int i = 0; i < pos - 1; i++) {
                temp1 = temp;
                temp = temp.next;
            }
            temp1.next = newNode;
            newNode.prev = temp1;
            newNode.next = temp;
        }
    }

    public static void main(String[] args) {

        create_dll list = new create_dll();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Display List");
            System.out.println("3. Insert at Start");
            System.out.println("4. Insert at End");
            System.out.println("5. Insert at Any Position");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    list.insertData();
                    break;
                case 2:
                    list.displayList();
                    break;
                case 3:
                    list.insertAtStart();
                    break;
                case 4:
                    list.insertAtEnd();
                    break;
                case 5:
                    list.insertAtAnyPosition();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to continue? (0/1): ");
            choice = scanner.nextInt();
        } while (choice == 1);

        scanner.close();
    }
}
