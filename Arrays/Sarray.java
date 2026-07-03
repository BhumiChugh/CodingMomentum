import java.util.Scanner;
public class Sarray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array you want: ");
        int n= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element of array: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("{");
for (int i = 0; i < n; i++) {
    System.out.print(arr[i]);
    if (i < n - 1) System.out.print(", ");
}
System.out.println("}");

        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }

        System.out.println("Sum of this above array is: "+s);

    }
}