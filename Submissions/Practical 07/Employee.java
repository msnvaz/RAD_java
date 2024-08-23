class Employee {
    String name;
    int salary;

    // Default constructor
    Employee(String name) {
        this.name = name;
        this.salary = 40000; // Default salary
    }

    // Constructor with custom salary
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("Jane Doe", 50000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
