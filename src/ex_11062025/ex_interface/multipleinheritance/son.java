package ex_11062025.ex_interface.multipleinheritance;

public class son implements father,mother{

    @Override
    public void money() {
        System.out.println("only one function this is");
        // because son is completing it
    }

    @Override
    public void home() {
        System.out.println("daddy gave me");
    }
}
