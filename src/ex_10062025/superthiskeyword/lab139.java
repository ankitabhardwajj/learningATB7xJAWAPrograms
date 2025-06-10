package ex_10062025.superthiskeyword;

public class lab139 {
    class student extends person{
        @Override
        void message (){
        System.out.println("i m student");
    }

    void display (){
        super.message();
    }


}
class person{
        void message (){
            System.out.println("i m person");
        }
    }
}

