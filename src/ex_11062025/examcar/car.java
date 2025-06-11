package ex_11062025.examcar;

abstract class car extends engine{
    @Override
    void start() {
        System.out.println("start the engine");
    }

    @Override
    void stop() {
        System.out.println("stop the engine");
    }

    @Override
    void partgearbox() {
        System.out.println("part of gear box");
    }

    @Override
    void open() {
        System.out.println("open the car");
    }

    @Override
    void speed() {
        System.out.println("speed is");
    }
}
