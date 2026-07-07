import java.util.Scanner;
public class Creation_Input{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //method 1
        // int arr[][]= new int[2][3];
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // System.out.println();
        // }

        // method 2
        // int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // System.out.println();
        // }
        
        //method3
        System.out.print("Enter no. of rows in the array:");
        int r= sc.nextInt();
        System.out.print("Enter no. of columns in the array:");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
            }
        System.out.println();
        }
        System.out.println("The array is:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}
