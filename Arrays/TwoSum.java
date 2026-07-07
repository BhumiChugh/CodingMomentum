import java.util.Scanner;
public class TwoSum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+"th element of Array: ");
            arr[i]=sc.nextInt(); 
        }
        System.out.print("Enter the target Sum: ");
        int s= sc.nextInt();
        int k=1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==s){
                    System.out.println(k+")"+" Two sum found: "+arr[i]+" and "+arr[j]);
                    k+=1;}
                
            }

        }
        if(k==1){
            System.out.println("No two elements in the array sums up to be "+s);
        }

    }
}