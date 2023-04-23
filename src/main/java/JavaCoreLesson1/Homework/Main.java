package JavaCoreLesson1.Homework;

public class Main {
    public static void main(String[] args) {

        Team team = new Team(new Person[]{
                new Person("Джек", 25),
                new Person("Рув", 60),
                new Person("Филл", 45),
        });

        System.out.println("Команда: ");
        System.out.println(team);

        Course course = new Course(new Barrier[] {
                new Pool(5, 15),
                new Wall(1, 5),
                new Track(100, 20),
                new Wall(1, 5),
        });
        course.doIt(team);
        System.out.println("Победители: ");
        team.showResults();
    }
}
