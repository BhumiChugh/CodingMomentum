import java.util.Scanner;

public class ReverseRows{
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

        System.out.println("After revsersing all the rows in given matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<(c/2);j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][c-j-1];
                arr[i][c-j-1]=temp;
            }
        }
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
    }
}