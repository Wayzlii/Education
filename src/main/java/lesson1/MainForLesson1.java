package lesson1;

public class MainForLesson1 {

    public static void main(String[] args) {
//        System.out.println("Привет, мир!!!");
//        printHello();

//        testVars();

        checkAppraisal();

    }

    private static void checkAppraisal() {
        int appraisal = 2;
        System.out.println("Школьник принёс оценку! " + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец, так держать!");
        } else if (appraisal == 4) {
            System.out.println("Молодец, но ты можешь лучше!");
        } else if (appraisal == 3 || appraisal == 2 || appraisal == 1) {
            System.out.println("Готовь уроки лучше!");
            /*else if (appraisal <=3 && appraisal >=1) {
        System.out.println("Готовь уроки лучше!");
        }*/
        } else if (appraisal > 5 || appraisal <1) {
            System.out.println("Неверный тип данных.");
            /* else {
            System.out.println("Неверный тип данных.");
        }*/
        }

        System.out.println("Проверка дневника окончена.");

    }

    private static void testVars() {

        int varA;
        varA = 15;
        int varB = 987;

        System.out.println(1.0 * varA / varB);
        System.out.println((double) varA / varB);

        double varDoubleA = 9.15;
        double varDoubleB = 2;

        System.out.println(varDoubleA / varDoubleB);
        System.out.println(2.0 / 3);

        int result1 = (int)(varA / varDoubleB);
        double result2 = varA / varDoubleB;

        System.out.println(result1 + "," + result2);

        boolean isRed = false;

        char char1 = 'G';
        char char2 = '☺';
        System.out.println(char1 + "\n" + char2);
        System.out.println((char)(char1 + char2));

        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + ", " + worldStr + "! " + (3 + 5));
        System.out.println(helloStr + ", " + worldStr + "! " + 3 + 5);

    }

    public static void printHello() {
        System.out.println("Привет!");
        System.out.println("Мы в методе printHello!");
        System.out.println(")))))");
    }

}