public class Occurences {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        System.out.println(Occurences(arr,3));
    }

    static int Occurences(int[] arr, int Number){
         int  count =0;
        for(int i=0; i< arr.length; i++){
            if(Number == arr[i]){
                count++;
            }
        }
        return count;
    }
}
