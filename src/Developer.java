public class Developer extends Employee {
    // Additional attributes specific to a Developer
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, int employeeId, double baseSalary, String department, String programmingLanguage, int projectsCompleted) {
        // Call the parent (Employee) constructor using super()
        super(name, employeeId, baseSalary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer.");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (projectsCompleted * 1000);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo method
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
