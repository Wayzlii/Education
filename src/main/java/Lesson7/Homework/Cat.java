package Lesson7.Homework;

public class Cat {
    private String name;
    private boolean hunger;
    private int hungerLvl;
    public Cat (String name, int hungerLvl) {
        this.name = name;
        this.hungerLvl = hungerLvl;
        this.hunger = true;
    }
    public boolean isHunger () {
        return hunger;
    }

    public void eat (Plate plate) {
        if (hungerLvl == plate.remove(hungerLvl)) {
            hunger = false;
        }
    }
    public void sleep() {
        hunger = true;
    }
}