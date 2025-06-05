package ex_04062025;

public class lab096 {
    public static void main(String[] args) {
        // basically 4 types of functions


        // 1. without parameters and without return type
        // 2. without parameters and with return type
        // 3. with parameters and without return type
        // 4. with parameters and with return type both

        function_type1();

         String name =function_type2();{
            System.out.println(name);
        }

        function_type3(name = "ankita");

        int sum_result = function_type4(4,5);{
            System.out.println(sum_result);
        }



    }
    static void function_type1(){
        System.out.println("without parameters, without return type");
    }

    static String function_type2() {
        System.out.println("without parameters and with return type");
        return "ankita";
    }

    static void function_type3(String name){
        System.out.println("you have shared -> " +name);
        System.out.println("with parameters and without return type");
    }

    static int function_type4(int a, int b){
        System.out.println("with parameters and with return type both");
        return a+b;
    }
}
