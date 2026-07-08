import java.util.Scanner;

public class MatrixSum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows of Array: ");
        int r= sc.nextInt();
        System.out.print("Enter no. of columns of Array: ");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        System.out.println();
        }
        System.out.println("The Array is:");
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

        System.out.println("The sum of all elements of the Array is: "+sum);
    }
}