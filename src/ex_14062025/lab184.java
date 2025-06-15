package ex_14062025;

import java.util.Stack;

public class lab184 {
    public static void main(String[] args) {
        // vector,Stack -> legacy
        // rarely used in automation

        Stack s1 = new Stack<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        // can use push instead of add too
        System.out.println(s1);
        System.out.println(s1.peek());// c is the last one
        // it just means to show which is on the top
        // like we put -a book first, then b book , then c book
        // so c should be on the top
        System.out.println(s1.pop());// pop means removing the last one
        System.out.println(s1);
    }
}
