package ex_14062025;

import java.util.ArrayList;
import java.util.LinkedList;

public class lab183 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("node 1");
        l.add("node 2");
        l.add("node 3");
        System.out.println(l);


        ArrayList l2 = new ArrayList<>();
        l2.add("node 1");
        l2.add("node 2");
        l2.add("node 3");
        System.out.println(l2);
        // it is not visible but they are stored differently
    }
}
