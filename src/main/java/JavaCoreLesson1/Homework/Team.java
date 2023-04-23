package JavaCoreLesson1.Homework;

import java.util.Arrays;

public class Team {

    private Person[] persons;

    public void showResults(){
        for (Person person: persons) {
            if (person.isWin()) {
                System.out.println(person);
            }
        }
    }

    public Team(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Team{" +
                "persons=" + Arrays.toString(persons) +
                '}';
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

}
