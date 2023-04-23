package JavaCoreLesson1;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Murzic", "Black", 8);
        Turtle turtle = new Turtle("Aaba", "Green", 46);

        System.out.println(cat);
        System.out.println(turtle);

        cat.setAge(-1);
        System.out.println(cat);

        Cat cat2 = new Cat("Barsik", "Braun", 4);
        Cat cat3 = new Cat("Barsik", "Braun", 4);

        System.out.println(cat2.equals(cat3));

        cat.voice();
        turtle.voice();

        Wolf wolf = new Wolf("Akella", "Gray", 5);
        System.out.println(wolf);
        wolf.voice();

        cat.setSwimmingSpeed(10);
        wolf.setSwimmingSpeed(15);
        turtle.setSwimmingSpeed(3);

        Pool pool = new Pool(30);

        cat.swim(pool);
        wolf.swim(pool);
        turtle.swim(pool);
    }
}
