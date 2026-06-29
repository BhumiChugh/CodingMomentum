//Mutiply odd inxed elements with 2 and even indexed elements mei add 10
public class ArrayQues{
    public static void main(String args[]){
        int arr[]={23,12,45,322,56,123,90};
        System.out.print("Original array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++){
            if(i%2==0){ arr[i]+=10;}
            else{ arr[i]*=2;}
        }
        System.out.println();
        System.out.print("After updation Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}