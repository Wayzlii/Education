package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeworkTicTakToy {
    public static void main(String[] args) {
        startGame();
    }

    private static int size;
    private static final char PLAYERS_MOVE = 'X';
    private static final char AIS_MOVE = 'O';
    private static final String EMPTY_CELL = " ";
    private static final char CAGE_TO_FILL_IN = '.';
    private static char[][] MAP;
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random(87557);

    private static void startGame() {
        initSizeMap();
        printMap();
        while (true) {
            userMove();
            aiMove();
            printMap();
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
                System.out.print(MAP[i][j] + EMPTY_CELL);
            }
            System.out.println();
        }
    }

    private static void printHeaderMap() {
        System.out.print(EMPTY_CELL + EMPTY_CELL);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY_CELL);
    }

    public static void initSizeMap() {
        System.out.println("Введите размер игрового поля: ");
        size = in.nextInt();
        MAP = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = CAGE_TO_FILL_IN;
            }
        }
    }

    private static void userMove() {
        int columnNumber;
        int rowNumber;
        System.out.println("Введите координату строки: ");
        rowNumber = in.nextInt();
        System.out.println("Введите координату столбца: ");
        columnNumber = in.nextInt();
        MAP[rowNumber - 1][columnNumber - 1] = PLAYERS_MOVE;
    }

    private static void aiMove() {
        int columnNumber;
        int rowNumber;
        rowNumber = random.nextInt(size) + 1;
        columnNumber = random.nextInt(size) + 1;
        MAP[rowNumber - 1][columnNumber - 1] = AIS_MOVE;
    }
}

