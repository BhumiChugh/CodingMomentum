public class DefaultValue{
    public static void main(String args[]){

        //integer type array
        System.out.print("Integer type array default values: ");
        int arr[]=new int[6];
        for (int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //double type array
        System.out.print("Double type array default values: ");
        double arr1[]=new double[6];
        for (int i=0;i<6;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //character type array
        System.out.print("Character type array default values: ");
        char arr2[]=new char[6];
        for (int i=0;i<6;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //string type array
        System.out.print("String type array default values: ");
        String arr3[]=new String[6];
        for (int i=0;i<6;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}