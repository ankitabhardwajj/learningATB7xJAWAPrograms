package ex_13062025.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lab176 {
    public static void main(String[] args) {
        //Collection framework
        // collection -> interface
        // collection(I) -> list(I)
        // list (I) -. arraylist, linkedlist, vector, stack

       // Collection list3 = new ArrayList(); // dynamic dispatch
        // List list = new ArrayList(); // dynamic dispatch
        ArrayList list2 = new ArrayList(); // dynamic dispatch
        list2.add("ankita");
        list2.add(12);
        System.out.println(list2);// [ankita,12]
        System.out.println(list2.size());// 2
        System.out.println(list2.contains(12));// true
        System.out.println(list2.contains("priya"));// false
        String s1 = (String) list2.get(0);
        System.out.println(s1);


    }
}
