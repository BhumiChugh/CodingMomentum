import java.util.Scanner;
public class Reverse_Array{
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
        // printing reversed array
        System.out.print("Reversed array is : ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Storing reversed array:");
        
            for(int i=0;i<n/2;i++){
                arr[i]+=arr[n-i-1];
                arr[n-i-1]=arr[i]-arr[n-i-1];
                arr[i]=arr[i]-arr[n-i-1];
            }
        

        System.out.println("Storing even sized reversed array: ");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}