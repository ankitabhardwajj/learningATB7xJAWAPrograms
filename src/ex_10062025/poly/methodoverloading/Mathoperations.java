package ex_10062025.poly.methodoverloading;

public class Mathoperations {
    // encapsulation and method overloading

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int add (int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }


    double add(double a,float b){
        return a+b;
    }

    String add(String a,char b){
        return a+b;
    }

    Mathoperations(){}
    Mathoperations(int a){}
    Mathoperations(int a, int b){}
    Mathoperations(int a, int b, int c){}
}


