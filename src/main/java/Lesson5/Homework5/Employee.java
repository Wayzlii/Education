package Lesson5.Homework5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public Employee(int salary, int age) {
        this("отсутствует", "отсутствует", "отсутствует", "отсутствует", salary, age);
    }
    public Employee() {
        this(0, 0);
    }
    public void printInfo() {
        System.out.println(String.format("ФИО сотрудника: %s. %nДолжность сотрудника: %s. %nEMAIL сотрудника: %s. %nНомер телефона сотрудника: %s. %n" +
                "Заработнач плата сотрудника: %s. %nВозраст сотрудника: %s. ", name, post, email, phoneNumber, salary, age));
    }

    public int getAge() {
        return age;
    }
}
