package Lesson5;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Александра", 1000, 80, 777);
        System.out.println("Всего игроков: " + Player.getPlayersCount());
        Player player2 = new Player("Владимир", 1200, 70, 500);
        Player player3 = new Player("Артем");
        System.out.println("Всего игроков: " + Player.getPlayersCount());

/*      player1.nickname = "Test";
        player2.level = 70;
        player1.money = 777;
        System.out.println(player2.nickname.toUpperCase()); */

        player3.setNickname("Артем великий");
        player3.setMoney(-999);
        player3.getLevel();

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.printInfo();
        }

        player1.action();
        player1.action();
        player1.action();

        player1.printInfo();

/*        player1.printInfo();
        player2.printInfo();
        player3.printInfo();*/
    }
}
