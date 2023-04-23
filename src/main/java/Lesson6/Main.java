package Lesson6;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
                3 принцмна ООП:
        1 - Инкапсуляция - сокрытие информации между слоями (к примеру, используя модификаторы доступа).

        2 - Наследование

        3 - Полиморфизм

        4* - Абстракция - абстрагируемся от лишних свойств оъекта, делаем акцент на свойствах,
        необходимых в данной конкретной ситуации.
         */

        Wizard wizard = new Wizard("Алексондр", 1000);
        Knight knight = new Knight("Анатолий", 777, "Katana");
        Player knight2 = new Knight("Святослав", 3000);

/*        wizard.printInfo();
        knight.printInfo();

        wizard.doAction();
        knight.doAction();*/

//        System.out.println(wizard);

        Player[] players = {wizard, knight, knight2};

        for(Player player : players) {
            player.printInfo();
            player.doAction();

/*            if (player instanceof Knight) {
                Knight k = (Knight) player; //так делать плохо!
                k.saddleHorse();
            }*/

            System.out.println();
        }

        Object[] objects = {
                new int[]{1,2,3},
                new Date(),
                new Scanner(System.in),
                Math.class,
                knight,
                "Привет, мир!"
        };
        for(Object object : objects) {
            System.out.println(object);
        }
    }
}
