import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("CAsian", 1, 7000);
        Programmer programmer = new Programmer("Popa", 2, 5000);

        // Testare metode
        manager.conductInterview();
        programmer.attendTraining();


        System.out.println(manager.getName() + " NR: " + manager.getId() + " are salariul: " + manager.getSalary());
        System.out.println(programmer.getName() + " NR: " + programmer.getId() + " are salariul: " + programmer.getSalary());


        //
        Programmer programmer1 = new Programmer("Sciur", 3, 5855);
        Programmer programmer2 = new Programmer("VAsilev", 4, 5500);


        List<AttendTraining> attendees = new ArrayList<>();
       // attendees.add(manager);
        attendees.add(programmer1);
        attendees.add(programmer2);


        MeetingRoom meetingRoom = new MeetingRoom(attendees);
        meetingRoom.conductTraining();


        System.out.println(manager.getName() + " NR: " + manager.getId() + " are salariul: " + manager.getSalary());
        System.out.println(programmer.getName() + " NR: " + programmer.getId() + " are salariul: " + programmer.getSalary());
        System.out.println(programmer1.getName() + " NR: " + programmer1.getId() + " are salariul: " + programmer1.getSalary());
        System.out.println(programmer2.getName() + " NR: " + programmer2.getId() + " are salariul: " + programmer2.getSalary());



        //Punctul 3
        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(programmer1);
        employees.add(programmer2);

        for (Employee employee : employees) {
            // tipul de angajat  angajat
            if (employee instanceof AttendTraining) {
                // Cast la AttendTraining
                AttendTraining attendTraining = (AttendTraining) employee;
                attendTraining.attendTraining();
            }

            if (employee instanceof ConductInterview) {
                // Cast la ConductInterview
                ConductInterview conductInterview = (ConductInterview) employee;
                conductInterview.conductInterview();
            }
        }

        // Print
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " NR: " + employee.getId() + " are salariul: " + employee.getSalary());
        }

    }
}