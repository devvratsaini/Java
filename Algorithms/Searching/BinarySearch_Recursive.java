import java.util.Scanner;

public class BinarySearch_Recursive{
    public static int binarySearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start)/2);
        if (key == arr[mid]) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearch(arr, key, start, mid-1);
        } else {
            return binarySearch(arr, key, mid+1, end);
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

        int index = binarySearch(arr, key, 0, size-1);
        if (index == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index " + index + ".");
        }
    }
}
