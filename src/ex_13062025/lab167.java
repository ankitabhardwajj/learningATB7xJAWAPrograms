package ex_13062025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab167 {
    public static void main(String[] args) {
        String path = "c://a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (Exception e) {
            System.out.println("E");
        }// we can not reverse these catch exceptions


    }
}
