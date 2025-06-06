package ex_06062025;

public class lab103 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        // it is final

        // disadvantages of array
        // 1. homogeneous
        // 2. fixed length
        // 3. wastage of memory}

        // example
        int []marks = new int[50];
        marks[1] = 10;
        marks[1] = 20;
        System.out.println(marks[1]);
        // other 49 values are wasted
        // we can change values even 100 times not a problem

    }
}
