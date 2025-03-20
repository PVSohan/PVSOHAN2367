import java.util.Scanner;

public class delete_dll {
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

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("No elements found");
        } else {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("No elements found");
        } else if (head.next == null) {
            head = null;
        } else {
            tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            temp = tail.prev;
            if (temp != null)
                temp.next = null;
        }
    }

    public void deleteAtAnyPosition() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter position you want to delete: ");
        int pos = s1.nextInt();
        if (pos == 1) {
            deleteAtStart();
        } else {
            temp = temp1 = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
        }
    }

    public static void main(String[] args) {
        delete_dll list = new delete_dll();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Display List");
            System.out.println("3. Delete at Start");
            System.out.println("4. Delete at End");
            System.out.println("5. Delete at Any Position");
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
                    list.deleteAtStart();
                    break;
                case 4:
                    list.deleteAtEnd();
                    break;
                case 5:
                    list.deleteAtAnyPosition();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to continue? (1/0): ");
            choice = scanner.nextInt();
        } while (choice == 1);

        scanner.close();
    }
}
