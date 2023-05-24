public class Lambdas_example {
    public static void main(String[] args) {
        Calculator cc = (a, b) -> System.out.println(a+b);
         cc.add(2,3);
    }
}

interface Calculator{
 void  add(int a, int b);


}