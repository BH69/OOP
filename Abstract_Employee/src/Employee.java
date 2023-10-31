abstract class Employee {
    private String empName;
    private double basicSalary;

    Employee(){}

    Employee(String empName, double basicSalary){
        this.empName = empName;
        this.basicSalary = basicSalary;
    }
    abstract double grossSalary();
    abstract void displayInfo();

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpName() {
        return empName;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
}
