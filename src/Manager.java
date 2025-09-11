public class Manager extends Employee{
    private double bonus;
    private int teamSize;

    public Manager(String name, int employeeId, double baseSalary, String department, double bonus, int teamSize) {
        super(name, employeeId, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + " has been promoted to Manager.");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void work() {
        super.work(); // Call parent's work method
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo method
        System.out.println("Bonus: $" + String.format("%.2f", bonus));
        System.out.println("Team Size: " + teamSize);
    }


}
