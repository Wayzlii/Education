package JavaCoreLesson2.Homework;

public class Main {
    public static void main(String[] args) {
        arraySum_ValidSizeValidData_Success();
        arraySum_ValidSizeInvalidData_ThrowMyArrayDataException();
        arraySum_InvalidSizeValidData_ThrowMyArraySizeException();
    }

    private static void arraySum_InvalidSizeValidData_ThrowMyArraySizeException() {
        try {
            System.out.println(arraySum(createArray(5, "3")));
        } catch (MyArraySizeException ex) {
            System.out.println("Некорректно указан рамер массива.");
        }
    }

    private static void arraySum_ValidSizeInvalidData_ThrowMyArrayDataException() {
        try {
            String[][] array = createArray(4, "2");
            array[2][0] = "Invalid";
            System.out.println(arraySum(array));
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void arraySum_ValidSizeValidData_Success() {
        System.out.println(arraySum(createArray(4, "3")));
    }

    public static String[][] createArray(int size, String a) {
        String[][] array = new String[size][size];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = a;
            }
        }
        return array;
    }

    public static int arraySum (String[][] array) {
        if (array.length != 4 && array[0].length != 4) throw new MyArraySizeException();

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int val = Integer.parseInt(array[i][j]);
                    sum += val;
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("В ячейке лежат неверные данные: " + i + " " + j);
                }
            }
        }
        return sum;
    }
}