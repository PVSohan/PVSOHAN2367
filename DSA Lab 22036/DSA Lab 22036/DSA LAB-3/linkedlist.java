import java.util.Scanner;

public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createNode(int data) {
        Node newNode = new Node(data);
        return newNode;
    }

    public void insert(Node[] head, int data, int position) {
        switch (position) {
            case 0:
                insertFromHead(head, data);
                break;
            case -1:
                insertFromTail(head, data);
                break;
            default:
                insertAtPosition(head, data, position);
                break;
        }
    }

    public void insertFromHead(Node[] head, int data) {
        Node newNode = createNode(data);
        newNode.next = head[0];
        head[0] = newNode;
    }

    public void insertFromTail(Node[] head, int data) {
        Node newNode = createNode(data);
        if (head[0] == null) {
            head[0] = newNode;
        } else {
            Node current = head[0];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtPosition(Node[] head, int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 0) {
            insertFromHead(head, data);
            return;
        }
        Node newNode = createNode(data);
        Node current = head[0];
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range!");
            newNode = null;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Node[] head = new Node[1];
        Scanner scanner = new Scanner(System.in);
        int choice, position, data;
        do {
            System.out.println("\n1. Insert from head");
            System.out.println("2. Insert from tail");
            System.out.println("3. Insert at position");
            System.out.println("4. Print list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    list.insertFromHead(head, data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    list.insertFromTail(head, data);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.insertAtPosition(head, data, position);
                    break;
                case 4:
                    printList(head[0]);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");