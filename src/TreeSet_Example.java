import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {
        String[] str = {"Geeks", "for", "Geeks","Cat","Ball","Dog"};
        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(Arrays.asList(str));

        Iterator<String> it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
