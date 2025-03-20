import java.util.Scanner;

public class queues {
    static int arr1[] = new int[100];
    static int front = -1;
    static int rear = -1;

    public static void insert_element() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the element you want to insert:");
        int element = s1.nextInt();
        if (rear == 99) {
            System.out.println("Overflow: queue is full.");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            arr1[rear] = element;

        } else {
            rear++;
            arr1[rear] = element;
        }

    }

    public static void delete_element() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow: queue is empty.");
        } else {
            System.out.printf("Element deleted is %d\n", arr1[front]);
            front++;
        }
    }

    public static void display_element() {
        if (rear < 0) {
            System.out.println("No elements present in the stack.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner s1 = new Scanner(System.in);
        int exit_condition;
        do {
            System.out.println("Enter your choice: 1) insert from rear 2) delete from front 3)  Display");
            choice = s1.nextInt();
            switch (choice) {
                case 1:
                    insert_element(); // Calling methods using the instance
                    break;
                case 2:
                    delete_element();
                    break;
                case 3:
                    display_element();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Do you want to continue? (1 for yes, 0 for no)");
            exit_condition = s1.nextInt();
        } while (exit_condition == 1);
    }
}
