import java.util.Scanner;
public class Wave_Array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+") value of Array: ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("Original Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        if(n%2==0){
            int i=0;
            while(i<n-1){
                arr[i]+=arr[i+1];
                arr[i+1]=arr[i]-arr[i+1];
                arr[i]-=arr[i+1];
                i+=2;
            }
        }

        else{
            int i=0;
            while(i<(n-2)){
                arr[i]+=arr[i+1];
                arr[i+1]=arr[i]-arr[i+1];
                arr[i]-=arr[i+1];
                i+=2;
            }
        }
        System.out.println();
        System.out.print("Wavy Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}