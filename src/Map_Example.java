import java.util.*;
public class Map_Example {
    public static void main(String[] args) {
        Map<String, Integer> me = new HashMap<String, Integer>();
        me.put("a", 100);
        me.put("b" , 200);
        me.put("c" , 300);

        for(Map.Entry m : me.entrySet()){
            System.out.println(m.getValue());
            System.out.println(m.getKey());
        }
        }
    }

