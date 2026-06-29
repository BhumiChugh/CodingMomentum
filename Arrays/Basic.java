import java.util.Scanner;
public class Basic{
    public static void main(String args[]){

        // PREDEFINED ARRAY
        // int arr[]={90,89,34,2,145,34};
        // int i=0;

        // while( i<(arr.length)){
        //     System.out.print("("+i+") "+arr[i]+"\n");
        //     i++;
        // }

        Scanner sc= new Scanner(System.in);
        // USER DEFINED ARRAY
        // int arr[]= new int[4];
        int[] arr= new int[4];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value for "+i+"th"+" index: ");
            int n= sc.nextInt();
            arr[i]=n;
        }
        int i=0;
        while( i<(arr.length)){
            System.out.print("("+i+") "+arr[i]+"\n");
            i++;
        }

    }
}