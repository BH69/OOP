public class Programmer extends Employee{
    private double noHrsWorked, RPH;

    Programmer(){}
    Programmer(String empName, double basicSalary, double noHrsWorked, double RPH){
        super(empName, basicSalary);
        this.noHrsWorked = noHrsWorked;
        this.RPH = RPH;
    }
    public double grossSalary() {
        return super.getBasicSalary()+noHrsWorked*RPH;
    }
    public void displayInfo() {
        System.out.println("Programmer name: " + this.getEmpName());
        System.out.println("Basic Salary: " + this.getBasicSalary());
        System.out.println("No. of Hours Worked: " + noHrsWorked);
        System.out.println("Rate Per Hour: " + RPH);
        System.out.println("Gross Salary: " + grossSalary());
    }
    public void setNoHrsWorked(double noHrsWorked) {
        this.noHrsWorked = noHrsWorked;
    }
    public double getNoHrsWorked() {
        return noHrsWorked;
    }
    public void setRPH(double RPH) {
        this.RPH = RPH;
    }
    public double getRPH() {
        return RPH;
    }
}
