package ex_08062025.accessmodifiers.criminal;

import ex_08062025.accessmodifiers.police.cop;

public class theif {
    public static void main(String[] args) {
        cop c = new cop(100);
        System.out.println(c.gun);
        c.canishoot();


        // cop2
        // we can not use this as this is private
    }
}
