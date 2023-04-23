package JavaCoreLesson1;

public class Turtle extends Animal implements CanSwim{

    private double swimmingSpeed;

    public double swim(Pool pool) {
        System.out.println("Я черепаха и я плыву! ");
        double timeToOvercome = pool.getLenght() / swimmingSpeed;
        System.out.println("Проплыла за " + timeToOvercome);
        return timeToOvercome;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Черепаха кряхтит! ");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}