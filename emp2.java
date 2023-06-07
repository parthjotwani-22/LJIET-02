public class emp2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5]; // Create an array to hold 5 Employee objects

        // Create 5 employee objects
        employees[0] = new Employee("Raj", 01);
        employees[1] = new Employee("Kanika", 02);
        employees[2] = new Employee("Vishnu", 03);
        employees[3] = new Employee("Preeti", 04);
        employees[4] = new Employee("Prakash", 05);

        // Display the count of total number of employees
        System.out.println("Total number of employees: " + Employee.getCount());
    }
}

class Employee {
    private String name;
    private int employeeId;
    private static int count = 0;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        count++; // Increment the count when a new employee is created
    }

    public static int getCount() {
        return count;
    }
}