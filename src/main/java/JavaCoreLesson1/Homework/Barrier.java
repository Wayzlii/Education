package JavaCoreLesson1.Homework;

public abstract class Barrier {
    private int size;
    private int energyLose;


    public Barrier(int size, int energyLose) {
        this.size = size;
        this.energyLose = energyLose;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEnergyLose() {
        return energyLose;
    }

    public void setEnergyLose(int energyLose) {
        this.energyLose = energyLose;
    }
}
