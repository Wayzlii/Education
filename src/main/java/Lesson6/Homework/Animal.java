package Lesson6.Homework;
import java.util.Scanner;

public abstract class Animal {
    protected String nickname;

    Scanner enter = new Scanner(System.in);

    public void setEnter() {
        System.out.println("Введите какое расстояние было пройдено: ");
        Scanner enter = this.enter;
        System.out.println("Пройденное расстояние: " + enter + " метров.");
    }

    public void run(int run) {
        System.out.printf("%s пробежал ", nickname + run + " метров!%n");
    }
    public void swim(int swim) {
        System.out.printf("%s проплыл ", nickname + swim + " метров!%n");
    }

    public Animal(String nickname) {
        this.nickname = nickname;
    }
    @Override
    public String toString () {
        return String.format("%s", nickname);
    }
    public void printInfo() {
        System.out.println(this);
    }
}