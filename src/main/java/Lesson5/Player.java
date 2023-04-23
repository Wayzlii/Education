package Lesson5;

public class Player {
    //Модификаторы доступа: 1. public - можно обратиться из любого места приложения.
    //                      2. private - нельхя обратиться ниоткуда, кроме самого клсса.
    //                      3. protected -
    //                      4. default(private-package) - есть у всех по умолчанию (если не прописан другой модификатор). Виден лишь в пределах одного пакета.
    private static int playersCount;
    private String nickname;
    private int points;
    private int level;
    private int money;

    public static int getPlayersCount() {
        return playersCount;
    }

    public Player(String nickname, int points, int level, int money) {
        setNickname(nickname);
        this.points = points;
        this.level = level;
        this.money = money;

        playersCount++;
    }

    public Player(String nickname) {
        this(nickname, 0 ,1, 100);
    }

    public Player() {
        this("");
    }

    public void printInfo() {
        System.out.println(String.format("Игрок %s(lvl: %s) имеет %s очков и %s монет. ", nickname, level, points, money));
    }

    public void action() {
        System.out.printf("Пользователь %s выполняеь некоторые действия и получается 100 очков! %n", nickname);
        points += 100;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname.toUpperCase();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0) {
            money = Math.abs(money);
        }
        this.money = money;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }
}
