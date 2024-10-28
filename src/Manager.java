public class Manager extends Employee implements ConductInterview {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void conductInterview() {
        System.out.println(getName() + " is conducting an interview.");
    }
}