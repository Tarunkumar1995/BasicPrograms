public class ExceptionalHandling {
    public static void main(String[] args) {

        try{
            divide(2,0);
        }
        catch (Exception e){
            System.out.println("NUmber cannot divide by zero");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
}
