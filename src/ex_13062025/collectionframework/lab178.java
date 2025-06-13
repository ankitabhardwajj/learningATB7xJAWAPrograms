package ex_13062025.collectionframework;

import java.util.List;

public class lab178 {
    public static void main(String[] args) {
        List shopping_list = List.of("banana","mango");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        shopping_list.add("papaya");// can not add
    }
}
