import java.util.*;
public class All_in_one_array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner s1=new Scanner(System.in);
        System.out.println("enter size of array:");
        int s11=s1.nextInt();
        int[] a= new int[s11];
        System.out.println("enter the elements in array");
        for (int i=0;i<s11;i++)
        {
            a[i]=s1.nextInt();
        }
    int s = a.length;
    int choice;
    do {
      System.out.println("1. Insert element");
      System.out.println("2. Delete element");
      System.out.println("3. Sort array");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          insertElement(a, s);
          break;
        case 2:
          deleteElement(a, s);
          break;
        case 3:
          sortArray(a);
          System.out.println("Sorted array:");
          for (int num : a) {
            System.out.print(num + " ");
          }
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice! Please enter a valid choice.");
      }
    } while (choice != 4);
    sc.close();
  }
  public static void insertElement(int[] a, int s) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the index of the element to insert (0 to " + s + "): ");
    int index = sc.nextInt();
    if (index < 0 || index > s) {
      System.out.println("Invalid index! Please enter an index between 0 and " + s);
      return;
    }
    System.out.print("Enter the value of the element to insert: ");
    int value = sc.nextInt();
    int[] newArray = new int[s + 1];
    for (int i = 0; i < s; i++) {
      if (i == index) {
        newArray[i] = value;
      } else {
        newArray[i] = a[i];
      }
    }
    newArray[s] = a[s - 1];
    System.out.println("New array after insertion: ");
    for (int num : newArray) {
      System.out.print(num + " ");
    }
    a = newArray;
    s++;
  }

  public static void deleteElement(int[] a, int s) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the index of the element to delete (0 to " + (s - 1) + "): ");
    int del_idx = sc.nextInt();
    if (del_idx < 0 || del_idx >= s) {
      System.out.println("Invalid index! Please enter an index between 0 and " + (s - 1));
      return;
    }
    int[] newArray = new int[s - 1];
    for (int i = 0, j = 0; i < s; i++) {
      if (i != del_idx) {
        newArray[j++] = a[i];
      }
    }
    System.out.println("Array after deleting the element:");
    for (int num : newArray) {
      System.out.print(num + " ");
    }
    a = newArray;
    s--;
  }
  public static void sortArray(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
  }
}