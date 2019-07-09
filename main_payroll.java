/**
 *
 * @author Muhammad Arief
 */
import java.util.*;
import javax.swing.*;
public class main_payroll {
    public static void main(String [] args)
    {
        double epf = 0.11;
        double socso = 0.00;
        double workday = 26;
        boolean temp = true;
        //boolean temp2 = true;
        
        JOptionPane.showMessageDialog(null,"Welcome to Payroll Administration");
        
        double basicsalary = Double.parseDouble(JOptionPane.showInputDialog(null,"Basic Salary"));
        
        if (basicsalary < 1100 || basicsalary > 2000)
        {
            JOptionPane.showMessageDialog(null,"Error. Please Key-in Correct Data.");
            basicsalary = Double.parseDouble(JOptionPane.showInputDialog(null,"Basic Salary"));
        }
        
        double takeleave = Double.parseDouble(JOptionPane.showInputDialog(null,"Take Leave: "));
                
        double salaryperday = basicsalary / workday;
        double comework = workday - takeleave;
        double salary = salaryperday * comework;
        double amount_epf = salary * epf;
        if (basicsalary == 1100){socso = 5.25;}
        else if (basicsalary <=1200){socso = 5.75;}
        else if (basicsalary <=1300){socso = 6.25;}
        else if (basicsalary <=1400){socso = 6.75;}
        else if (basicsalary <=1500){socso = 7.25;}
        else if (basicsalary <=1600){socso = 7.75;}
        else if (basicsalary <=1700){socso = 8.25;}
        else if (basicsalary <=1800){socso = 8.75;}
        else if (basicsalary <=1900){socso = 9.25;}
        else {socso = 9.75;}
        
        double totalSalary = salary - amount_epf -socso;
        
        System.out.printf("Basic Salary: RM%.2f",basicsalary);
        System.out.println();
        System.out.printf("Salary Per Day: RM%.2f",salaryperday);
        System.out.println();
        System.out.printf("EPF: RM%.2f",amount_epf);
        System.out.println();
        System.out.printf("SOCSO: RM%.2f",socso);
        System.out.println();
        System.out.printf("Salary: RM%.2f",totalSalary);
        System.out.println();
        System.out.println(".................................................");
        System.out.println("Days Come to work: "+comework+" days / "+workday+" days");
        System.out.println("Days Take Leave: "+takeleave+" days");
        System.out.println(".................................................");
    }
}

