public class lab031 {
    public static void main(String[] args) {
        int course = 100;
        float GST =  18.45f;
       // int total = course+GST; // implicit narrowing- JVM
        int total = course+ (int)GST;// explicit narrowing - real time example
        System.out.println(total); // loss of 0.45
    }
}
