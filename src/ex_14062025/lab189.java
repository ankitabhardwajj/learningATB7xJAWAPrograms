package ex_14062025;

import java.util.*;

public class lab189 {
    public static void main(String[] args) {
        Set fruits = new HashSet();// random order
        fruits.add("apple");
        fruits.add("chiku");
        fruits.add("banana");
        fruits.add(null);// np -> not add null
        System.out.println(fruits);

        Set colours = new LinkedHashSet(); // ordered
        colours.add("blue");
        colours.add("pink");
        colours.add("white");
        colours.add(null);// np -> but add null
        System.out.println(colours); // can not put same 2 times, will print only one time
        // but print both times if one is small nd second is large , CASE SENSITIVE

        Set pages = new TreeSet();// focus on the first letter
        pages.add(1);
        pages.add(5);
        pages.add(4);
        //pages.add(null);// problem
        System.out.println(pages);

        Iterator it = pages.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // can use iterator or for anything

        Set pagesname = new TreeSet();
        pagesname.add("ankita's");
        pagesname.add("priya's");
        pagesname.add("bryer's");
        System.out.println(pagesname);

        for (Object s : pagesname) {
            System.out.println(s);
        }




    }
}

