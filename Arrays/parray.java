import java.util.Scanner;
public class parray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array you want: ");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element of array: ");
            arr[i]=sc.nextInt();
        }

        int P=1;
         for(int i=0;i<n;i++){
            P=P*arr[i];
        }

        System.out.println("Product of elements of the array is: "+P);
    }
}
