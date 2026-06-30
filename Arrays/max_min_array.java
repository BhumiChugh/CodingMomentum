import java.util.Scanner;
public class max_min_array{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array you want: ");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element of array: ");
            arr[i]=sc.nextInt();
        }
        int Max=arr[0];
         for(int i=0;i<n;i++){
           if(arr[i]>=Max){
            Max=arr[i];
           }
        }
        int Min=arr[0];
        for(int i=0;i<n;i++){
           if(arr[i]<=Min){
            Min=arr[i];
           }
        }

        System.out.println("Max element of array is: "+Max);
        System.out.println("Min element of array is: "+Min);
    }
}