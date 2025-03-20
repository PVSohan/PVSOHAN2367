import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);    //Calling method
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
        int key = arr[i];   /*Store the current element arr[i] in the variable key. This element will be compared and inserted into the correct position in the sorted subarray.*/
        int j = i - 1; /*This variable is used to traverse the sorted subarray (from i - 1 to 0) to find the correct position for the key element*/
       while (j >= 0 && arr[j] > key) /*Continue iterating backwards through the sorted subarray as long as j is greater than or equal to 0 (ensuring we don't go out of bounds) and the current element (arr[j]) is greater than the key element.*/
{ 
      arr[j + 1] = arr[j]; /*If the current element is greater than the key element, shift the element one position to the right to make space for inserting the key.*/
                j--;  /*Decrement j to move to the previous element in the sorted subarray.*/
            }
            arr[j + 1] = key;  /*Once the correct position for the key element is found (where arr[j] <= key), insert the key element into the array at position j + 1.*/
        }
/*The outer loop continues until all elements in the array have been considered and placed in their correct positions.*/
    }
}
/*Another Soln.: Using arrayList
import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list); 
/* ->It is a method call in Java that sorts the elements of a list in ascending order.
-> Collections.sort(list) is a static method provided by the Collections class. It takes a list (specifically, a List object) as its argument and sorts the elements of the list in ascending order. The list can contain elements of any type that implements the Comparable interface (i.e., elements that have a natural ordering). 
->Comparable interface to determine their natural ordering. This interface defines a method named compareTo() that compares the current object with another object of the same type. The sorting algorithm uses the compareTo() method to compare elements and arrange them in the correct order.
*/
        System.out.println("Sorted list: " + list);
    }
}*/
