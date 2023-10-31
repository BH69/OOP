import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Manager M = new Manager();

        System.out.println("<<<Data Entry for Manager>>>");
        System.out.print("Name: ");
        String n = SC.nextLine(); M.setEmpName(n);
        System.out.print("Salary: ");
        double s = SC.nextDouble(); M.setBasicSalary(s);
        System.out.print("Bonus(Annual):");
        double b = SC.nextDouble(); M.setBonus(b);

        System.out.println("<<<Manager Details Report>>>");
        M.displayInfo();

        System.out.println("--------------------");
        SC.nextLine();

        Programmer P = new Programmer();
        System.out.println("<<<Data Entry for Programmer>>>");
        System.out.print("Name: ");
        String isName = SC.nextLine(); P.setEmpName(isName);
        System.out.print("Salary: ");
        double isSalary = SC.nextDouble(); P.setBasicSalary(isSalary);
        System.out.print("Total Hours Worked: ");
        double isTHW = SC.nextDouble(); P.setNoHrsWorked(isTHW);
        System.out.print("Rate/Hour: ");
        double isRPH = SC.nextDouble(); P.setRPH(isRPH);

        System.out.println("<<< Programmer Details Report >>>");
        P.displayInfo();
    }
}