import java.util.Scanner;

public class SelectionSortWithPasses {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("\nPass " + (i + 1) + ":");

            for (int j = i + 1; j < n; j++) {
                System.out.println("  Comparing " + arr[j] + " and " + arr[minIndex]);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                System.out.println("  Swapping " + arr[i] + " and " + arr[minIndex]);
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            } else {
                System.out.println("  No swap needed");
            }

            System.out.print("  Array after pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nStarting Selection Sort...");
        selectionSort(arr);

        System.out.print("\nFinal Sorted Array: ");
        printArray(arr);

        scanner.close();
    }
}
