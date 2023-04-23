package JavaCoreLesson2;

import JavaCoreLesson1.Cat;

public class UncheckedExceptions {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        /*try {
            int c = a/b;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }*/

        if(b != 0) {
            int c = a/b;
            System.out.println(c);
        }
        System.out.println("Im here!");
        System.out.println("Im alive!");

        String[] strings = {"dkjfhvs", "skdhuf"};
        if(2 < strings.length && 2 >= 0){
            System.out.println(strings[2]);
        }

        Cat cat = null;
        if(cat != null) {
            System.out.println(cat.toString());
        }
    }
}
