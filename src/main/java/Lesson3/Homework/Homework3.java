package Lesson3.Homework;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
//        replacingAnArray();
//        fillingTheArray();
//        doublingOfArrayElements();
        stairsArray();
//        arrayWithArgs(4, 8);

        System.out.println(findMax());
    }

    private static int findMax() {
        int[] array = {1, 8, 5, 14, 38, 3, 6, 55, 10};
        
        return 0;
    }



        private static void arrayWithArgs ( int len, int initialValue ){
            int[] array = new int[len];
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            System.out.println(Arrays.toString(array));
        }

        private static void stairsArray () {
            int[][] array = new int[5][5];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i == j) {
                        array[i][j] = 1;
                    }
                }
                System.out.println(Arrays.toString(array[i]));
            }
            for (int i = array.length - 1; i >= 0; i--) {
                for (int j = array.length - 1; j >= 0; j--) {
                    if (i == j) {
                        array[i][j] = 1;
                    }
                }
                System.out.println(Arrays.toString(array[i]));
            }
        }

        private static void doublingOfArrayElements () {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] = array[i] * 2;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        private static void fillingTheArray () {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            System.out.println(Arrays.toString(array));
        }

        private static void replacingAnArray () {
            int[] array = {1, 0, 1, 1, 0, 0, 0, 1, 1, 0};
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else if (array[i] == 1)
                    array[i] = 0;
            }
            System.out.println(Arrays.toString(array));
        }
    }
