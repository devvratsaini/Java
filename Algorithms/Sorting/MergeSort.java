import java.util.Scanner;

public class MergeSort{
    private static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return;
        }

        int midIdx = len/2;

        int[] leftHalf = new int[midIdx];
        int[] rightHalf = new int[len - midIdx];

        for (int i = 0; i < midIdx; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = midIdx; i < len; i++) {
            rightHalf[i-midIdx] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
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

        System.out.print("Array before sorting: ");
        printArray(arr);

        mergeSort(arr);

        System.out.print("Array after sorting: ");
        printArray(arr);
    }
}
