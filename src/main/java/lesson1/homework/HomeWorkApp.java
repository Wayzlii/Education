package lesson1.homework;

public class HomeWorkApp {

    public static void main(String[] args) {

        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printTreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = -123;
        int b = 93;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Суммма положительная");
        } else if (result < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 4458;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (value >100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 3349;
        int b = 888456;
        if (a >= b) {
            System.out.println("a>=b");
        } else if (a < b) {
            System.out.println("a<b");
        }
    }
}