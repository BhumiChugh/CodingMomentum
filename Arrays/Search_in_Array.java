import java.util.Scanner;
public class Search_in_Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+"th element of Array: ");
            arr[i]=sc.nextInt(); 
        }
        System.out.println();
        int b=0;
        System.out.print("Enter the element you wish to search: ");
        int a=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]!=a){
                continue;
            }
            else{
                System.out.println("Element found! :)\n"+a+ " is at index: "+i);
                b=1;
            }
        }
        if(b==0){
            System.out.println("Element not found in the Array! :(");
        }
        
    }
}