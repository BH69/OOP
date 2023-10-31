public class Manager extends Employee{
    private double bonus;

    Manager(){}
    Manager(String empName, double basicSalary, double bonus){
        super(empName, basicSalary);
        this.bonus = bonus;
    }
    @Override
    public double grossSalary() {
        return super.getBasicSalary() + bonus;
    }
    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + this.getEmpName());
        System.out.println("Basic Salary: " + this.getBasicSalary());
        System.out.println("Annual Bonus: " + bonus);
        System.out.println("Total Salary: " + grossSalary());

    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
}
