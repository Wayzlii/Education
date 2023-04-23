package Lesson6;

import java.net.Socket;

public class Knight extends Player {

    private String swordTitle;
    public Knight(String nickname, int points, String swordTitle) {
        super(nickname, points, "Рыцарь."); //вызов контруктора родителя всегда должен быть на первой строке!
        this.swordTitle = swordTitle;
    }

    @Override
    public void doAction() {
        System.out.printf("%s машет мечём %s.%n",getNickname(), getSwordTitle());
    }

    public Knight(String nickname, int points) {
        this(nickname, points, "Ржовый меч. ");
    }

    public void saddleHorse() {
        System.out.printf("Рыцар %s кричит: Вперед, плотва! %n", nickname);

    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }
/*    public void printInfo() {
        super.printInfo();
        System.out.printf("Его меч: %s.%n", swordTitle);
    }*/

    @Override
    public String toString() {
        return super.toString() + " " + String.format("Его меч: %s.", swordTitle);
    }
}
