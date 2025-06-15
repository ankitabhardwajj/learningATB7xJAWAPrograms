package ex_14062025;

import java.util.HashMap;
import java.util.Map;

public class lab192 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("ank",1);
        m.put("a",3);
        m.put("an",2);
        // null as value allowed many times
        // null as key allowed one
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("a"));
        System.out.println(m.containsValue(1));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.get("an"));


        System.out.println("------------");

        // how to iterate
        for (Map.Entry<String,Integer> item: m.entrySet()){
            System.out.println(item.getKey() + "->" + item.getValue());
        }
    }
}
