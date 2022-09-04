package ClassTask9.task1;

public class EmployeeWithAHourlySalary implements Salary {
    private double hourly;
    private int numberHour;
    private double monthSalary;

    public EmployeeWithAHourlySalary() {
        this.hourly = 20;
        this.numberHour = 176;
    }

    public void setNumberHour(int numberHour) {
        this.numberHour = numberHour;
    }

    @Override
    public double salary() {
        monthSalary = hourly * numberHour;
        return monthSalary;
    }
}
