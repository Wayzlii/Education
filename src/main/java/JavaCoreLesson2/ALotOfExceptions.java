package JavaCoreLesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfExceptions {
    public static void main(String[] args) {

//        try {
        int[] strings = {1, 2};
        int st = strings[2];

        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int a = 1/st;

//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Я всё равно выполнился!");
//        }
    }

    public static void test() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("342wfs");
    }
}
