package ex_11062025.ex_interface.example2;

 interface engine {
     void startengine();
     void stopengine();

     default void enginejuststart(){
         System.out.println(" engine just started");
     }
     default void enginejuststop(){
         System.out.println("engine just stopped");
     }
     static void e1(){
         System.out.println("e1");
     }

     // cn use complete just by using default methods

     void m2();
     void m3();
    // void m5(){
      //   System.out.println("not possible because it is complete");
     // }
 }
