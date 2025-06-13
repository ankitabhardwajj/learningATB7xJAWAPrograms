package ex_13062025.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab182 {
    public static void main(String[] args) {
        // iterator
        List<String> list = new ArrayList<>();
        list.add("ankita");
        list.add("bhardwaj");

        System.out.println(" print arraylist 1");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }

        System.out.println("print arraylist 3");

        for (String str : list){
            System.out.println(str);
        }

        System.out.println("print arralist 3");

        Iterator<String> mak = list.iterator();
        while (mak.hasNext()){
            System.out.println(mak.next());
        }

    }
}
