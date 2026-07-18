

package Exercise4_EmployeeManagement;

public class EmployeeArray {

    Employee[] employees;
    int count;

    public EmployeeArray(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee Added Successfully!");
        } else {
            System.out.println("Array is Full.");
        }
    }

    // Search Employee
    public void searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {
                System.out.println("Employee Found");
                employees[i].display();
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Traverse Employees
    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }
}