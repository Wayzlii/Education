package JavaCoreLesson2;

public class Main {
    public static void main(String[] args) {
//        int a = 1/0;
//        System.out.println();
        test();
    }
    public static void test() {
//        test();
        test1();
    }
    public static void test1() {
        test2();
    }

    private static void test2() {
        int a = 1/0;
    }
}
