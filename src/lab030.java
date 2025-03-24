public class lab030 {
    public static void main(String[] args) {
        // type casting - source and destination conversion
        // two concepts - widening and narrowing
        // widening = implicit, explicit - lossless
        // narrowing = implicit, explicit(with data type) , loss


        // widening
        byte b = 10;
        int a = b;// VALID - implicit casting - JVM
        int a1 = (int)b; // VALID - explicit casting

        // narrowing
        int value = 300;
       // byte d = c; // INVALID - implicit casting - JVM
        // as we cant store the big thing into the small one
        byte d1 = (byte)value;// INVALID - explicit casting
        System.out.println(d1);
        // the extra will get overflow
        // first 300 will be converted into the binary number
        // then, the bits will be terminated
        // and that binary number will get converted


    }
}
