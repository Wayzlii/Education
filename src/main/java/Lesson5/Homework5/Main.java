package Lesson5.Homework5;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("Иванов Иван Иванович", "Художник", "ivanov12@mail.ru", "+7-777-777-77-77", 12000, 34);
//        employee.printInfo();

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Художник", "ivaniv@mail.ru", "+7-777-777-77-77", 60000, 72);
        employeesArray[1] = new Employee("Васильев Василий Васильевич", "Аниматор", "vasya@mail.ru", "+5-555-555-55-55", 83000, 36);
        employeesArray[2] = new Employee("Григорьев Григори Григорьевич", "Уборщик", "", "", 15000, 43);
        employeesArray[3] = new Employee("Кириллов Кирилл Кириллович", "Стажер", "", "", 10000, 19);
        employeesArray[4] = new Employee("Исмаилов Исмаил Исмаилович", "Администратор", "", "", 27000, 25);

        for (int i = 0; i < employeesArray.length; i++) {
            Employee employee = employeesArray[i];
            int age = employee.getAge();
            if (age >= 40) {
                employee.printInfo();
            }
        }
    }
}
