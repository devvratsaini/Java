import java.util.Scanner;

public class LinearSearch_Recursive{
    public static int linearSearch(int[] arr, int key, int idx) {
        if (idx < 0) {
            return -1;
        } else if (arr[idx] == key) {
            return idx;
        } else {
            return linearSearch(arr, key, --idx);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array, one by one: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        int index = linearSearch(arr, key, size-1);
        if (index == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index " + index + ".");
        }
    }
}
