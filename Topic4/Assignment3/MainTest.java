

public class MainTest {

    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1 = new Employee(101, "James", "james@test.com", 'M', 20000);
        Employee emp2 = new Employee(102, "Tess", "tess@test.com", 'F', 36000);
        Employee emp3 = new Employee(103, "John", "john@test.com", 'M', 29000);
        Employee emp4 = new Employee(104, "Nina", "nina@test.com", 'M', 40000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();
        empDb.deleteEmployee(102);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();

        System.out.println(empDb.showPaySlip(103));
    }

}