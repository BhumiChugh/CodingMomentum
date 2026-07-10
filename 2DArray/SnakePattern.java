import java.util.Scanner;

public class SnakePattern{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows of Array1: ");
        int r= sc.nextInt();
        System.out.print("Enter no. of columns of Array1: ");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
            }
        System.out.println();
        }
        System.out.println("The Array1 is:");
        System.out.print("[ ");
        for(int i=0;i<r;i++){
            System.out.print("[ ");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.print("] ");
        if(i!=r-1){
            System.out.println();
        }
        else{
            System.out.print("] ");
            System.out.println();
            }
        }
        System.out.println();
        int n1=r*c;
        int k=0;
        int arr1[]=new int[n1];
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    arr1[k]=arr[i][j];
                    k++;
                }
            }
            else{
                for(int j=c-1;j>=0;j--){
                    arr1[k]=arr[i][j];
                    k++;
                }

            }
        }
        System.out.println("Snake Pattern is: ");
        System.out.print("[ ");
        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("]");
    }
}