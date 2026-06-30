import java.util.Scanner;
public class Segregate_Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n =sc. nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements of array: ");
            arr[i]=sc.nextInt();
        }
        // printing original array
        System.out.print("Original array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // two pointer technique + MY TECHNIQUE
        int i=0;
        
        int j=n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0 ){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;}
            if(arr[i]==0){
            i++;}
            if(arr[j]==1){
            j--; }
        }

        System.out.println();
        System.out.println("Array after segregation: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}