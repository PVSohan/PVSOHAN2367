import java.util.Scanner;

public class stacks {
    static int arr1[] = new int[100];
    static int top = -1;

    public static void insert_element() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the element you want to insert:");
        int element = s1.nextInt();
        if (top >= 99) { // Changed 100 to 99 because array index starts from 0
            System.out.println("Overflow: Stack is full.");
        } else {
            top++;
            arr1[top] = element;
        }
    }

    public static void delete_element() {
        if (top < 0) {
            System.out.println("Underflow: Stack is empty.");
        } else {
            System.out.printf("Element deleted is %d\n", arr1[top]);
            top--;
        }
    }

    public static void top_most_element() {
        if (top < 0) {
            System.out.println("Underflow: Stack is empty.");
        } else {
            System.out.printf("Topmost element is %d\n", arr1[top]);
        }
    }

    public static void display_element() {
        if (top < 0) {
            System.out.println("No elements present in the stack.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
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
            System.out.println("Enter your choice: 1) Push 2) Pop 3) Peek 4) Display");
            choice = s1.nextInt();
            switch (choice) {
                case 1:
                    insert_element(); // Calling methods using the instance
                    break;
                case 2:
                    delete_element();
                    break;
                case 3:
                    top_most_element();
                    break;
                case 4:
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