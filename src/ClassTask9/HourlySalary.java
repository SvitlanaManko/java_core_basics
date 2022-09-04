package ClassTask9;

public class HourlySalary implements Salary {
    int hourly = 120;


    @Override
    public int givSalary(int numberDay) {
        return (hourly * 8) * numberDay;
    }
}
