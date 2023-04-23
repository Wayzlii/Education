package Lesson7.Homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat[] catArray = new Cat[]{
                new Cat("Shurik", 6),
                new Cat("Barsik", 4),
                new Cat("Mursik", 7),
        };
        Plate plate = new Plate(30);

        while (true) {
            for (int i = 0; i < catArray.length; i++) {
                Cat cat = catArray[i];
                cat.eat(plate);
                cat.sleep();
            }
            if (plate.getFood() == 0)
                break;
            plate.fill(3);
        }

    }
}