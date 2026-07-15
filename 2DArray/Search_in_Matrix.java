import java.util.Scanner;
public class Search_in_Matrix{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows of Array: ");
        int r= sc.nextInt();
        System.out.print("Enter no. of columns of Array: ");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
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
        System.out.print("Enter target value to search in Matrix: ");
        int tar=sc.nextInt();
        int rows,col;
        rows=0;
        boolean check=false;
        col=c-1;
        while(rows<r && col>=0){
            if(arr[rows][col]==tar){
                System.out.print("Target Found !! :)\nAt Index: ["+rows+","+col+"]");
                check=true;
                break;
            }
            else if(tar<arr[rows][col]){
                 col-=1;
            }
            else{
                rows+=1;
            }
        }
        if(check==false){
            System.out.println("Target Not Found!! :(");
        }
    }
}