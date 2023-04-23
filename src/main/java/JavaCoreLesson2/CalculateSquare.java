package JavaCoreLesson2;

public class CalculateSquare {
    public static void main(String[] args) {
        try {
            System.out.println(calcRectangleSquare(2,9));
        } catch (OneOrBothRectangleSideIsNegativeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int calcRectangleSquare(int a, int b) throws OneOrBothRectangleSideIsNegativeException {
        if(a >= 0 && b >= 0) {
            return a * b;
        }
        throw new OneOrBothRectangleSideIsNegativeException("Rectangle sides can not be negative!");
    }
}
