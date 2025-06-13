package ex_13062025.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class lab179 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("hee");
        mylist.add("yes");
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("yes");
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
        mylist.add("hee");
        mylist.add("yes");
        mylist.add("ok");
        System.out.println(mylist);
        mylist.set(2,"yesok");
        System.out.println(mylist);

        System.out.println("-----------------");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

            System.out.println("-----------------");

            for (Object o : mylist){
                System.out.println(o);
            }

        }
    }
}
