package Exercise4_EmployeeManagement;

public class Main {

    public static void main(String[] args) {

        EmployeeArray employeeArray = new EmployeeArray(5);

        employeeArray.addEmployee(new Employee(101, "John", "Manager", 50000));
        employeeArray.addEmployee(new Employee(102, "Alice", "Developer", 40000));
        employeeArray.addEmployee(new Employee(103, "David", "Tester", 35000));

        System.out.println("\nEmployee Records:");
        employeeArray.displayEmployees();

        System.out.println("\nSearching Employee ID 102");
        employeeArray.searchEmployee(102);

        System.out.println("\nDeleting Employee ID 101");
        employeeArray.deleteEmployee(101);

        System.out.println("\nEmployee Records After Deletion:");
        employeeArray.displayEmployees();
    }
}
