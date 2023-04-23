package JavaCoreLesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim{

    private boolean isWild;
    private double swimmingSpeed;

    public double swim(Pool pool) {
        System.out.println("Я кот и я плыву! ");
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

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Кот сказал МЯУ! ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() && Objects.equals(getName(), cat.getName()) && Objects.equals(getColor(), cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getAge());
    }

    public String toString() {

        return "Cat " +
                "name = " + getName() +
                ", color = " + getColor() +
                ", age = " + getAge();
    }
}
