//printing pascals triangle for n units
import java.util.ArrayList;
import java.util.Scanner;
public class PascalTriangle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value till which you want your triangle: ");
        int n =sc.nextInt();
        ArrayList<ArrayList <Integer>> arr= new ArrayList<>();
        for(int i=1;i<=n;i++){
        ArrayList<Integer> a = new ArrayList<>();   // HAR iteration mein NAYA object
        for(int j=0;j<i;j++){
            a.add(0);   // placeholder elements daale, taaki .set() baad mein kaam kare
        }
        arr.add(a);
        }
        

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                if(i==0 || i==j || j==0){
                    arr.get(i).set(j,1);
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                if(i!=0 && i!=j && j!=0){
                    arr.get(i).set(j,((arr.get(i-1).get(j))+(arr.get(i-1).get(j-1))));
                }
                // else{
                //     arr.get(i).set(j,((arr.get(i-1).get(j))+(arr.get(i-1).get(j-1))));
                // }
            }
        }
        System.out.println();
        System.out.println("Pascal's Triangle is as follows:" );
        for( int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}