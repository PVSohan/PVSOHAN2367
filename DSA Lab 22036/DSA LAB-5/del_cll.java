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

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
        tail.next = head; // Update tail's next to head for circularity
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        Node current = head;
        Node previous = null;
        while (current.next != head) {
            previous = current;
            current = current.next;
        }
        if (previous != null) {
            previous.next = head; // Update previous node's next to head
            tail = previous; // Update tail to previous node
        } else {
            head = null;
            tail = null;
        }
    }

    public void deleteFromAnyPosition() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the node you want to delete:");
        int pos = scanner.nextInt();
        if (pos < 1) {
            System.out.println("Invalid position. Position must be positive.");
            return;
        }
        if (pos == 1) {
            deleteFromStart();
        } else {
            Node previous = null;
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                previous = current;
                current = current.next;
            }
            if (current.next == head) { // If the node to be deleted is the last node
                previous.next = head; // Update previous node's next to head
            } else {
                previous.next = current.next; // Link the previous node to the next node, skipping the current node
            }
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

        list.deleteFromStart();
        System.out.println("List after deleting from the start:");
        list.displayList();

        list.deleteFromEnd();
        System.out.println("List after deleting from the end:");
        list.displayList();

        list.deleteFromAnyPosition();
        System.out.println("List after deleting from any position:");
        list.displayList();
    }
}
