public class LargestNsmallestNumber {
    public static void main(String[] args) {
        int arr[] = {2,10,51,15,20,96,35};
         maxNmin(arr);
    }

    static void maxNmin(int[] array){
        int largest = array[0];
        int smallest = array[0];

        for(int i= 0; i< array.length;i++){
            if(array[i] > largest) largest = array[i];
        }

        for(int i= 0; i< array.length;i++){
            if(array[i] < smallest) smallest = array[i];
        }
        System.out.println("Largests is " + largest + " " + "Smallest is " + smallest);
    }
}
