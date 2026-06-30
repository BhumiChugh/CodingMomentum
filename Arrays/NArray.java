//priting negative elements of array only
import java.util.Scanner;

public class NArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the length of array you want: ");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element of array: ");
            arr[i]=sc.nextInt();
        }

        //finding out negatives
        System.out.println("Negative numbers in the array are: ");
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }


        }
    }
}