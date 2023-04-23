package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe2 {
    private static int size;
    private static int winSize;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = " ";
    public static final String SPACE_MAP_SYMBOL = " ";

    private static char[][] MAP = new char[size][size];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;

//    public static void main(String[] args) {
//        turnGame();
//    } - вызов игры происходит в новом классе main
    public static void start() {
        do {
            System.out.println("\n\nИгра начинается!");
//            initMap();
            init();
            printMap();
            playGame();
        } while (isContinueGame());
    }

    private static void init() {
        turnsCount = 0;
        size = getSizeFromUser(); //получить размер игрового поля
        winSize = getWinSizeFromUser(); //подобрать победную серию для выбанного размера
        initMap();
    }

    private static int getWinSizeFromUser() {
        if (size >= 3 && size <= 6) {
            return 3;
        } else  if (size > 6 && size <= 10) {
            return 4;
        }
        return 5;
    }

    private static int getSizeFromUser() {
        System.out.println("Необходимо выбрать размер игрового поля: ");
        return getValidNumberFromScanner(3, 9);
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "н", "у", "+", "да" -> true;
            default -> false;
        };
    }

    private static void initMap() {

        MAP = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void playGame() {
        while (true) {
            humanTern();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTern();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static boolean checkEnd(char symbol) {
        //Победа
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Ура, вы победили!");
            } else {
                System.out.println("Победил компьютер.");
            }
            return true;
        }

        //Ничья
        if (checkDraw()) {
            System.out.println("НИЧЬЯ!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
 /*       for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true; */

        return turnsCount >= size * size;
    }

    private static boolean checkWin(char symbol) {
        if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if(MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if(MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if(MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if(MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if(MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if(MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        return false;
    }

    private static void aiTern() {
        System.out.println("\nХОД КОМПЬЮТЕРА!");
        int rowNumber;
        int columnNumber;
        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
    private static void humanTern() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки. ");
            rowNumber = getValidNumberMapLineFromScanner();
            System.out.print("Введите координату столбца. ");
            columnNumber = getValidNumberMapLineFromScanner();

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется.%n", rowNumber + 1, columnNumber + 1);
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int getValidNumberMapLineFromScanner() {
        return getValidNumberFromScanner(1, size) - 1;
    }

    private static int getValidNumberFromScanner(int min, int max) {
        while (true) {
            System.out.println("Введите число!");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if(isNumberValid(n, min, max)) {
                    return n;
                }
                System.out.printf("ОШИБКА! Проверьте значение координаты. Должно быть от %s до %s. Введено: %s%n", min, max, n);
            } else {
                System.out.printf("ОШИБКА! Ввод допускает лишь целые числа! %s - не целое число.%n", in.next());
            }
        }
    }

    private static boolean isNumberValid(int n, int min, int max) {
        return n >= min && n <= max;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }
}
