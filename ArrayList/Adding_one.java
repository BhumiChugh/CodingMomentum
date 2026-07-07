import java.util.ArrayList;
import java.util.Scanner;
public class Adding_one{

    static Scanner sc= new Scanner(System.in);

    public void Adding(ArrayList<Integer> arr){
    System.out.print("Enter element to add in ArrayList: ");
    int n=sc.nextInt();
    arr.add(n);
    }
    public static void main(String args[]){
    
    ArrayList<Integer> arr= new ArrayList<>();
    Adding_one obj= new Adding_one();
    
    obj.Adding(arr);
    
    
    
    
    while(true){
        sc.nextLine();
        System.out.print("Do you wish to add more number?(yes/no) ");
        String s=sc.nextLine();

        if(s.equalsIgnoreCase ("Yes") ){
            obj.Adding(arr);
        }
        else{
            break;
        }
    }
    System.out.println("The ArrayList is before adding one: "+arr);

    
    int k= arr.size();
    
    int c=1;
    int i=k-1;
   

    ArrayList<Integer> ans= new ArrayList<>();
    for(int j=0;j<k+1;j++){
        ans.add(0);
    }
    while(i>=0){
        int s=arr.get(i)+c;
        if(s==10){
            ans.set(i+1,0);
            c=1;
            i--;}
        else{
            ans.set(i+1,s);
            c=0;
            i--;
        }
        }
    ans.set(0,c);
    
    if(ans.get(0)==0){
        ans.remove(0);
    }
    System.out.println("The ArrayList is after adding one: "+ans);
    
    }}


