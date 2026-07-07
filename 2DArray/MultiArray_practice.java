 public class MultiArray_practice{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("only the first row...");
        int arr1[][]={{1,2,7},{4,5,7},{7,8,7}};
        for(int i=0;i<1;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" "+arr1[i][j]+" ");
            }
        }
    
    }
}