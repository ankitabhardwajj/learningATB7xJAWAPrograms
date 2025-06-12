package ex_12062025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab161 {
    public static void main(String[] args)  {
        // checked
      //  try {
        //    FileInputStream file = new FileInputStream("c://log.txt");
        //} catch (FileNotFoundException e) {
          //  throw new RuntimeException(e);
        //}


        // unchecked
        try {
            int a = 10;
            int b = a/0;// arithmetic exception
            System.out.println("b");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
