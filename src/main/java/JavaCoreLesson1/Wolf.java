package JavaCoreLesson1;

public class Wolf extends Animal implements CanSwim{

    private double swimmingSpeed;

    public double swim(Pool pool) {
        System.out.println("Я волк и я плыву! ");
        double timeToOvercome = pool.getLenght() / swimmingSpeed;
        System.out.println("Проплыл за " + timeToOvercome);
        return timeToOvercome;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Волк воет! ");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
