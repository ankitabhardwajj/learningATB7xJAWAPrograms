package ex_08062025.singleinheritance;

public class lab127 {
    public static void main(String[] args) {
        ankita a = new ankita();
        a.bhk3();
       // a.bhk2();
        // ankita can not use 2bhk cz it is of her father
        // there is no relation as of now
        // using this cause an error
        // to make relation we need to use 'extends'
        // but father can not extend ankita
        // cz ankita was not born when father

    }
}
