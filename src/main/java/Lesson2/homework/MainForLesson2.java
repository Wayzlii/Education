package Lesson2.homework;

public class MainForLesson2 {

    public static void main(String[] args) {

        System.out.println(checkTheSumOfNum(5, 8));
        checkTheSignBeforeTheNum(-15);
        System.out.println(checkTheSignBeforeTheNumSecond(8));
        printingLines("Hello", 8);
        System.out.println(isLeapYear(45));

    }

    private static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    private static void printingLines(String Str, int b) {

        for (int i = 1; i <= b; i = i + 1) {
            System.out.println(Str);
        }

    }

    private static boolean checkTheSignBeforeTheNumSecond(int a) {

        return a >= 0;

    }

    private static void checkTheSignBeforeTheNum(int a) {

        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    private static boolean checkTheSumOfNum(int a, int b) {

        int result = a + b;
        return result >= 10 && result <= 20;

    }

}


