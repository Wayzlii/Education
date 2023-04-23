package TaskBook;

public class Task2_12 {

    public static void main(String[] args) {
        int size = 7;
        char[][] arr = new char[size][size];
        char symbol = '*';
        char symbolEmpty = ' ';

        fillAllArray(arr, symbolEmpty);

        fillArray(arr, symbol);

        printMap(arr);
    }

    private static void fillAllArray(char[][] arr, char symbolEmpty) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = symbolEmpty;
            }
        }
    }

    private static void printMap(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillArray(char[][] arr, char symbol) {
        fillFirstLine(arr, symbol);
        fillLastLine(arr, symbol);
        fillDiagonalLine(arr, symbol);
    }

    private static void fillFirstLine(char[][] arr, char symbol) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = symbol;
        }
    }

    private static void fillLastLine(char[][] arr, char symbol) {
        for (int j = 0; j < arr[arr.length - 1].length; j++) {
            arr[arr.length - 1][j] = symbol;
        }
    }

    private static void fillDiagonalLine(char[][] arr, char symbol) {
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j == i; j++) {
            arr[i][i] = symbol;
//            }
        }
//        for (int i = arr.length - 1; i >= 0; i--) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = symbol;
//            }
//        }
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr[i][j] = symbol;
        }
    }
}