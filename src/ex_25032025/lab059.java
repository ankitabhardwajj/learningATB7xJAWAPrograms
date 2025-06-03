package ex_25032025;

public class lab059 {
    public static void main(String[] args) {
        // if u r using jdk> 13, u can use multiple conditions
         int itemcode = 23;
         switch (itemcode){
             case 1,2,3:
                 System.out.println("electronic gadget");
                 break;
             case 4,5,6:
                 System.out.println("mechanical gadget");
                 break;
             default:
                 System.out.println("none");
                 break;
         }

    }
}
