package ClassTask9.task1;

public class EmployeeWithAFixedSalary implements Salary {
    private double daily;
    private int numberDay;
    private double monthSalary;

    public EmployeeWithAFixedSalary() {
        this.daily = 180;
        this.numberDay = 20;
        this.monthSalary = 3700;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    @Override
    public double salary() {
        if (numberDay < 20) {
            monthSalary = daily * numberDay;
        }
        return monthSalary;
    }
}
