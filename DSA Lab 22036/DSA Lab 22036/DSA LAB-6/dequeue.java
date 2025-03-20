import java.util.Scanner;

public class dequeue {
    static int arr1[] = new int[100];
    static int max = 100;
    static int front = -1;
    static int rear = -1;

    public static void insert_from_rear() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the element you want to insert:");
        int element = s1.nextInt();
        if ((rear == max - 1 && front == 0) || front == rear + 1) {
            System.out.println("Overflow: queue is full.");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            arr1[rear] = element;

        } else if (rear == max - 1) {
            rear = 0;
            arr1[rear] = element;
        } else {
            rear++;
            arr1[rear] = element;
        }

    }

    public static void insert_from_front() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the element you want to insert:");
        int element = s1.nextInt();
        if ((rear == max - 1 && front == 0) || front == rear + 1) {
            System.out.println("Overflow: queue is full.");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            arr1[front] = element;

        } else if (front == 0) {
            front = max - 1;
            arr1[front] = element;
        } else {
            front--;
            arr1[front] = element;
        }

    }

    public static void delete_from_front() {
        if (front == -1) {
            System.out.println("Underflow: queue is empty.");
        } else if (front == rear) {
            System.out.printf("Element deleted is %d\n", arr1[front]);
            front = rear = -1;
        } else if (front == max - 1) {
            System.out.printf("Element deleted is %d\n", arr1[front]);
            front = 0;
        } else {
            System.out.printf("Element deleted is %d\n", arr1[front]);
            front++;
        }
    }

    public static void delete_from_rear() {
        if (front == -1) {
            System.out.println("Underflow: queue is empty.");
        } else if (front == rear) {
            System.out.printf("Element deleted is %d\n", arr1[rear]);
            front = rear = -1;
        } else if (rear == 0) {
            System.out.printf("Element deleted is %d\n", arr1[rear]);
            rear = max - 1;
        } else {
            System.out.printf("Element deleted is %d\n", arr1[rear]);
            rear--;
        }
    }

    public static void display_element() {
        if (rear < 0) {
            System.out.println("No elements present in the stack.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = front; i != rear; i = (i + 1) % max) {
                System.out.print(arr1[i] + " ");
            }
            System.out.print(arr1[rear]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner s1 = new Scanner(System.in);
        int exit_condition;
        do {
            System.out.println(
                    "Enter your choice: 1) insert from rear 2) delete from front 3)insert from front 4)delete from rear 5) Display");
            choice = s1.nextInt();
            switch (choice) {
                case 1:
                    insert_from_rear(); // Calling methods using the instance
                    break;
                case 2:
                    delete_from_front();
                    break;
                case 3:
                    insert_from_front(); // Calling methods using the instance
                    break;
                case 4:
                    delete_from_rear();
                    break;
                case 5:
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
