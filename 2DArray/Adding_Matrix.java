import java.util.Scanner;

public class Adding_Matrix{
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
        //............................................................
        //............................................................
        System.out.print("Enter no. of rows of Array2: ");
        int r1= sc.nextInt();
        System.out.print("Enter no. of columns of Array2: ");
        int c1= sc.nextInt();
        int arr1[][]= new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr1[i][j]=sc.nextInt();
            }
        System.out.println();
        }
        System.out.println("The Array2 is:");
        System.out.print("[ ");
        for(int i=0;i<r1;i++){
            System.out.print("[ ");
            for(int j=0;j<c1;j++){
                System.out.print(arr1[i][j]+" ");
            }
        System.out.print("] ");
        if(i!=r1-1){
            System.out.println();
        }
        else{
            System.out.print("] ");
            System.out.println();
            }
        }
        System.out.println();
        if(r==r1&&c==c1){
            int arr2[][]= new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr2[i][j]=arr[i][j]+arr1[i][j];
                }
            }
        // printing added matrix......
        System.out.println("Adding these two matrices give Matrix:");
        System.out.print("[ ");
        for(int i=0;i<r;i++){
            System.out.print("[ ");
            for(int j=0;j<c;j++){
                System.out.print(arr2[i][j]+" ");
            }
        System.out.print("] ");
        if(i!=r1-1){
            System.out.println();
        }
        else{
            System.out.print("] ");
            System.out.println();
            }
        }

        }

        else{
            System.out.println("The two arrays cannot be added as they are not of the same size.");
        }

        
        
          
      
    }
}