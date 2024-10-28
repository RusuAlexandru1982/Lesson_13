public class Programmer extends Employee implements AttendTraining {
    public Programmer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void attendTraining() {
        System.out.println(getName() + " is attending training.");
    }
}