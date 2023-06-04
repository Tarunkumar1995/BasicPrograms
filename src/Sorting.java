import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
       arraySorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arraySorting(int[] arr){
        int temp =0;
        for(int i =0; i< arr.length; i++){
            for(int j =i +1; j<arr.length; j++){
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
