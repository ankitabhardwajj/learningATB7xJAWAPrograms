package ex_08062025;

public class ATBperson {
    String name;
    long number;

    // DC


    ATBperson(){
        System.out.println("object is created");
    }

    ATBperson(String name){
        this.name = name;
    }

    ATBperson(String name,long number){
        this.name = name;
        this.number = number;
    }
}
