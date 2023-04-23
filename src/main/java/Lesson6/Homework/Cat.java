package Lesson6.Homework;

public class Cat extends Animal {

    public String toString() {
        return super.toString();
    }
    @Override
    public void run(int run) {
        if (run >= 0 && run <= 200) {
            super.run(run);
        } else {
            System.out.println("Кошка не может пробежать больше 200 метров.");
        }
    }
    @Override
    public void swim(int swim) {
        System.out.println("Кошка не умеет плавать.");
    }
    public Cat(String nickname) {
        super(nickname);
    }
}