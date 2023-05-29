public class Arrays_Count {
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,2,2,4,5,3,3};
        int count =0;
        for(int i =0; i< arr.length; i++){
            for(int j =0; j<i; j++)
            {
                if(arr[i] == arr[j]){
                    count ++;
                }
            }

        }
        System.out.println(count);
    }
}
