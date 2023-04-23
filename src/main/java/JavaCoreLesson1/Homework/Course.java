package JavaCoreLesson1.Homework;

public class Course {

    private Barrier[] barriers;

    public Course(Barrier[] barriers) {
        this.barriers = barriers;
    }


    public void doIt(Team team) {
        for (Person person: team.getPersons()) {
            boolean isWin = true;
            for (Barrier barrier: barriers) {
                int result = person.getEnergy() - barrier.getEnergyLose();
                person.setEnergy(result);
                if (result < 0) {
                    isWin = false;
                    break;
                }
            }
            person.setWin(isWin);
        }
    }
}
