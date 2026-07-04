import java.util.Scanner;
public class Second_Max{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array you want: ");
        int n= sc.nextInt();
        int arr[]=new int[n];

         for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element of array: ");
            arr[i]=sc.nextInt();
        }

        int Max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]>=Max){
            Max=arr[i];
           }
        }

        int M2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]!=Max && arr[i]>=M2){
                M2=arr[i];
           }
        }

        System.out.println("Second Maximum element in this array is:"+M2);

    }
}