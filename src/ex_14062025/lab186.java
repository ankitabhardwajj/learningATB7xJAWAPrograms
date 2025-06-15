package ex_14062025;

import java.util.ArrayList;
import java.util.Collections;

public class lab186 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(20);
        marks.add(90);
        marks.add(78);
        marks.add(56);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
