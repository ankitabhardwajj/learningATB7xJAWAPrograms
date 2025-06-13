package ex_13062025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;

public class lab168 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("hello ankita");
        String path = "c://a.txt";
        File file = new File("src/troy.txt");
        FileReader fileReader= new FileReader(file);
    }
}
