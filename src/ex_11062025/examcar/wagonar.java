package ex_11062025.examcar;

public class wagonar extends engine{
    void drive(){
        start();
        stop();
        partgearbox();
        speed();
        open();
    }

    @Override
    void start() {
        System.out.println("start the engine");
    }

    @Override
    void stop() {
        System.out.println("stop the engine");
    }

    @Override
    void speed() {
        System.out.println("speed is 100km/hr");
    }

    @Override
    void partgearbox() {
        System.out.println("part of gear");
    }

    @Override
    void open() {
        System.out.println("open the car");
    }
    // can do similary with tesla nd engine
}
