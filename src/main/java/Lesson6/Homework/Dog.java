package Lesson6.Homework;

public class Dog extends Animal {
    public String toString() {
        return super.toString();
    }
    @Override
    public void run(int run) {
        if (run >= 0 && run <= 500) {
            super.run(run);
        } else {
            System.out.println("Собака не может пробежть больше 500 метров.");
        }
    }
    @Override
    public void swim(int swim) {
        if (swim >= 0 && swim <= 10) {
            super.swim(swim);
        } else {
            System.out.println("Собака не может проплыть больше 10 метров.");
        }
    }
    public Dog(String nickname) {
        super(nickname);
    }
}