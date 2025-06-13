package ex_13062025.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lab180 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(23);
        marks.add(87);
        marks.add(65);
        marks.add(44);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
