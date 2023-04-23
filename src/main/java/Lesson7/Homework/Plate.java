package Lesson7.Homework;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int remove (int hunger) {
        if (food < hunger) {
            System.out.printf("Кот не поел, в миске мало еды. Осталось: %s.%n", food);
            return 0;
        } else {
            food -= hunger;
            System.out.printf("Кот съел %s еды из миски. Осталось: %s.%n", hunger, food);
            return hunger;
        }
    }
    public void fill(int food) {
        this.food += food;
    }
    public int getFood() {
        return food;
    }
}
