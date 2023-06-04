import java.util.ArrayList;
import java.util.List;

public class Lambdas_Example2 {
    public static void main(String[] args) {
      List<Integer> ll = new ArrayList<Integer>();

      ll.add(20);
      ll.add(2);
      ll.add(18);
      ll.add(19);
      ll.add(22);

      ll.forEach((n) -> {
          if(n % 2 ==0){
              System.out.println(n);
          }
      });
    }
}

