import java.util.Scanner;

public class StackLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void push() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data you want to push:");
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

    public int pop() {
        if (head == null) {
            System.out.println("Stack underflow");
            return -1; // Signifying stack underflow
        }
        if (head == tail) { // Single node case
            int data = head.data;
            head = null;
            tail = null;
            return data;
        }
        Node pre = head;
        tail = head;
        while (tail.next != null) {
            pre = tail;
            tail = tail.next;
        }
        int data = tail.data;
        pre.next = null;
        System.out.printf("popped element is %d", data);
    }

    public void displayStack() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.displayStack();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
