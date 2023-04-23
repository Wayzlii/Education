package JavaCoreLesson1;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        setAge(age);
    }

    public abstract void voice();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)  this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
