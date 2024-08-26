import java.util.Random;
import java.util.Scanner;

public class QuickSort{
    private static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) {
            return;
        }

        int mid = lowIdx + ((highIdx - lowIdx)/2);

        int pivotIdx = new Random().nextInt(highIdx - lowIdx) + lowIdx;
        int pivot = arr[pivotIdx];
        swap(arr, pivotIdx, highIdx);

        int lp = partition(arr, lowIdx, highIdx, pivot);

        quickSort(arr, lowIdx, lp-1);
        quickSort(arr, lp+1, highIdx);
    }

    private static int partition(int[] arr, int lowIdx, int highIdx, int pivot) {
        int lp = lowIdx, rp = highIdx - 1;

        while (lp < rp) {
            while (arr[lp] <= pivot && lp < rp) {
                lp++;
            }
            while (arr[rp] >= pivot && rp > lp) {
                rp--;
            }
            swap(arr, lp, rp);
        }
        if (arr[lp] > arr[highIdx]) {
            swap(arr, lp, highIdx);
        } else {
            lp = highIdx;
        }

        return lp;
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

        System.out.print("Array before sorting: ");
        printArray(arr);

        quickSort(arr);

        System.out.print("Array after sorting: ");
        printArray(arr);
    }
}
