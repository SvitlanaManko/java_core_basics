package ClassTask9.task1;

import ClassTask9.task1.EmployeeWithAFixedSalary;
import ClassTask9.task1.EmployeeWithAHourlySalary;

public class SalaryPayment {
    public static void main(String[] args) {
        EmployeeWithAHourlySalary salary=new EmployeeWithAHourlySalary();
        EmployeeWithAFixedSalary salary1=new EmployeeWithAFixedSalary();
        salary.setNumberHour(176);
        salary1.setNumberDay(20);
        System.out.println(salary.salary());
        System.out.println(salary1.salary());
    }
}
