package ex_10062025.poly.methodoverloading;

public class lab136 {
    public static void main(String[] args) {
        Mathoperations mathoperations = new Mathoperations();
        int result = mathoperations.add(35,4);
        double result2 = mathoperations.add(3.4, 4.4);
        double result3 = mathoperations.add(3.5, 5.5);
        String result4 = mathoperations.add("ankita", 'b');

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);



    }


}

