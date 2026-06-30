import java.util.Scanner;
public class Rotate_Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n =sc. nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements of array: ");
            arr[i]=sc.nextInt();
        }
        // printing original array
        System.out.print("Original array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter value of d: ");
        int d= sc.nextInt();
        for(int i=0;i<d;i++){
            arr[i]+=arr[n-d+i];
            arr[n-d+i]=arr[i]-arr[n-d+i];
            arr[i]=arr[i]-arr[n-d+i];
        }

        System.out.println("Array after some modifications:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}