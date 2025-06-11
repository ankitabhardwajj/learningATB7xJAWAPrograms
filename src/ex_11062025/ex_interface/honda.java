package ex_11062025.ex_interface;

public class honda implements engine{

    void drive(){
        startengine();
        stopengine();

    }
    @Override
    public void startengine() {
        System.out.println("start the honda");
    }

    @Override
    public void stopengine() {
        System.out.println("stop the honda");
    }
}
