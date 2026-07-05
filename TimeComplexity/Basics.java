//Finding duplicates in an array using three approaches
//APPROACH ONE (total no.of operations in this brute force methods=15)
public class Basics {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2, 3};
        System.out.println("Duplicates in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}

//APPROACH TWO FLAG METHOD(Total no.of operations in this method=7)
// boolean[]= new boolean[n+1];
// for(int i=0;i<n;i++){
//     int ele=arr[i];
//     if(flag[ele]==true){//imposter
//         System.out.print(ele+" ");
//     }
//     else{
//         flag[ele]=true;
//     }
// }
// extra array problem

//APPROACH THREE(Sum of natural numbers method)
