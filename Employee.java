import java.util.*;

public class Employee { // Main class representing an Employee
    public static void main(String[] args) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Scanner object for user input
        System.out.print("Enter company name: ");
        String cn = sc.nextLine(); // Read company name input

        System.out.print("Enter number of employees: ");
        int num = sc.nextInt(); // Read number of employees input
        sc.nextLine(); // Consume newline left-over

        Employee[] emp = new Employee[num]; // Array to store employee objects

        System.out.println("Enter employee details: ");
        for (int i = 0; i < emp.length; i++) { // Loop to input employee details
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Enter id: ");
            int a = sc.nextInt(); // Read employee id input
            sc.nextLine(); // Consume newline left-over

            System.out.print("Enter name: ");
            String b = sc.nextLine(); // Read employee name input

            System.out.print("Enter designation: ");
            String c = sc.nextLine(); // Read employee designation input

            System.out.print("Enter salary: ");
            double d = sc.nextDouble(); // Read employee salary input
            sc.nextLine(); // Consume newline left-over

            emp[i] = new Employee(a, b, c, d); // Create Employee object and store it in the array
        }
        Company com = new Company(cn, emp, num); // Create Company object

        System.out.println("Average Salary: " + com.getAverageSalary(emp)); // Print average salary
        System.out.println("Max Salary: " + com.getMaxSalary(emp)); // Print maximum salary

        System.out.print("Employee with Designation: ");
        String desi = sc.nextLine(); // Read designation input
        Employee[] ans = com.getEmployeesByDesignation(emp, desi); // Get employees with given designation
        if (ans != null) { // If employees found
            for (int i = 0; i < ans.length; i++) { // Loop through found employees
                System.out.println("ID: " + ans[i].getId() + ", Name: " + ans[i].getName() + ", Designation: " + ans[i].getDes() + ", Salary: " + ans[i].getSalary());
            }
        }
    }

    private int id;
    private String name;
    private String des; // Designation
    private double salary;

    public Employee(int id, String name, String des, double salary) { // Constructor to initialize Employee object
        this.id = id;
        this.name = name;
        this.des = des;
        this.salary = salary;
    }

    // Getter and setter methods for Employee fields
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDes() { return des; }
    public void setDes(String des) { this.des = des; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class Company { // Class representing a Company
    private String comName; // Company name
    private Employee[] emp; // Array of employees
    private int numEmp; // Number of employees

    public Company(String comName, Employee[] emp, int numEmp) { // Constructor to initialize Company object
        this.comName = comName;
        this.emp = emp;
        this.numEmp = numEmp;
    }

    // Method to calculate average salary of employees
    public double getAverageSalary(Employee[] e) {
        double sum = 0;
        for (int i = 0; i < e.length; i++) {
            sum += e[i].getSalary();
        }
        if (sum > 0) {
            double avg = sum / e.length;
            return avg;
        }
        return 0;
    }

    // Method to find maximum salary among employees
    public double getMaxSalary(Employee[] e) {
        double maxSal = e[0].getSalary();
        for (int i = 0; i < e.length; i++) {
            if (maxSal < e[i].getSalary()) {
                maxSal = e[i].getSalary();
            }
        }
        return maxSal;
    }

    // Method to find employees with given designation
    public Employee[] getEmployeesByDesignation(Employee[] e, String d) {
        Employee[] emp = new Employee[0];
        for (int i = 0; i < e.length; i++) {
            if (e[i].getDes().equalsIgnoreCase(d)) {
                emp = Arrays.copyOf(emp, emp.length + 1);
                emp[emp.length - 1] = e[i];
            }
        }
        if (emp.length > 0) {
            return emp;
        }
        return null;
    }
}
