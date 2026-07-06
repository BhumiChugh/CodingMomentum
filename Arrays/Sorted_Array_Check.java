import java.util.Scanner;
public class Sorted_Array_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = sc.nextInt();
        }
        // printing original array
        System.out.print("Original array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // checking if the array is sorted or not
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("This array is sorted.");
        } else {
            System.out.println("This array is not sorted.");
        }
    }
}