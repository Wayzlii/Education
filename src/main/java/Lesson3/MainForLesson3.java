package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainForLesson3 {

    public static void main(String[] args) {
//        System.out.println("Привет, мир!");
//        arraysIntro();
//        iterate();
//        arrayIndexOutOfBoundsException();

        int[] initialArray = {1, 2, 3, 4, 5};
        // дописать 6, 7, 8, 9, 10
        int[] additionalArray = {6, 7, 8, 9, 10};


        int[] union = new int[initialArray.length + additionalArray.length];
/*      for (int i = 0; i < initialArray.length; i++) {
            union[i] = initialArray[i];
        }
        System.out.println(Arrays.toString(union));

        for (int i = initialArray.length, j = 0; j < additionalArray.length && i < union.length ; i++, j++) {
            union[i] = additionalArray[j];
        }
        System.out.println(Arrays.toString(union));
    } */ // -склейка массивов вручную.

/*        System.arraycopy(initialArray, 0, union, 0, initialArray.length);
        System.out.println(Arrays.toString(union));
        System.arraycopy(additionalArray, 0, union, initialArray.length, additionalArray.length);
        System.out.println(Arrays.toString(union)); */ // -склейска массивов при помощи System.

        int[] ints = Arrays.copyOf(union, 4);

    }

        private static void arrayIndexOutOfBoundsException () {
            int[] array = new int[3];
//        System.out.println(array[3]); - Такого индекса нет. Исчисление индексов в массиве идет с 0.
        }

        private static void iterate () {
            int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        sum = array[0] + array[1] + array[2] + array[3] + array[4]; -способ не применить, если в массиве большое количество элементов.
            int sum = arraySum(array);
            System.out.println(sum);

            int[] array2 = {-1, -1, -1};
            System.out.println(arraySum(array2));
        }
        private static int arraySum ( int[] array){
            int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int a = array[i];
//            sum += a;
//        }               -1ый способ перебрать массив.
            for (int a : array) {
                sum += a;
            }                // -2ой способ перебрать массив. Подходит для перебора массива в прямом порядке, лиюо если порядок вообще не ваден.
            return sum;
        }

        private static void arraysIntro () {
            // int x = 5;
            int[] emptyArray = new int[5]; // [0, 0, 0, 0, 0]
            int[] createdArray = {1, 2, 3, 4, 5}; // [1, 2, 3, 4, 5]
            // нумерация ячеек в массиве начинается с 0.

            int thirdElement = createdArray[2];
            System.out.println(thirdElement);

            //       System.out.println(emptyArray); // Таким способом массив не получить.

            String emptyArrayAsString = Arrays.toString(emptyArray);
            System.out.println(emptyArrayAsString); // Способ получения данных из массива.
            System.out.println(Arrays.toString(createdArray)); //Способ получения данных из массива 2.

            emptyArray[3] = -1;
            System.out.println(Arrays.toString(emptyArray)); // Поменяли число в массиве данных.

            emptyArray[0] = 100;
            System.out.println(Arrays.toString(emptyArray)); // Поменяли число в массиве данных.
        }
    }
