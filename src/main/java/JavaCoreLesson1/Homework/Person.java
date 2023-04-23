package JavaCoreLesson1.Homework;

public class Person {
    private String name;
    private int energy;
    private boolean win;

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Person(String name, int energy) {
        this.name = name;
        setEnergy(energy);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", win=" + win +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy > 0) this.energy = energy;
    }
}
