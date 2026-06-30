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
        System.out.print("Enter position from which you wish to rotate: ");
        int e=sc.nextInt();

        e=e%n;
        int i=0;
        
        int j=e-1;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--; 
        }


        i=e;
        j=n-1;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--; 
        }
        
        i=0;
        
        j=n-1;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--; 
        }


        System.out.println();
        System.out.println("Array after rotation: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
}