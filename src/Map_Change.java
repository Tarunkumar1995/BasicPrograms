import java.util.HashMap;
import java.util.Map;

public class Map_Change {
    public static void main(String[] args) {
        Map<Integer ,  String> mm = new HashMap<Integer, String>();
        mm.put(1,"Chennai");
        mm.put(2,"GT");
        mm.put(3, "RCB");

        for(Map.Entry me : mm.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
        }

        mm.put(5 ,"GT");
        for(Map.Entry me : mm.entrySet()){
            System.out.println("\n" +me.getKey() + " " + me.getValue());
        }
    }
}
