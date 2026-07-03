import java.util.Arrays;
public class ShallowCopy_DeepCopy{
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        int x[]=arr;

        System.out.println(arr[2]);
        x[2]=90;
        System.out.println(arr[2]);
        // In Shallow copy only a new or an extra name is given for the original array and this og array can be accsed or updated using these extra names
        // og array is arr
        // extra or another array name is x
        // updation in x also changes original array

        System.out.println("Deep Copy");
        int deep[]=Arrays.copyOf(arr,arr.length);
        for(int i=0;i<deep.length;i++){
            System.out.print(deep[i]+" ");
        }
        deep[0]=100;
        System.out.println("After updation in deep, deep array:");
        for(int i=0;i<deep.length;i++){
            System.out.print(deep[i]+" ");
        }
        System.out.println("After updation in deep, original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // deep arrays are made using Arrays.copyOf(array,array length) and are used to copy content of one array to another
        // this new deep array is not linked to the original array, any updation in deep array wont reflect in original array
        
    }
}