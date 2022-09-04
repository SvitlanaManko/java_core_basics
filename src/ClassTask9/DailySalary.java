package ClassTask9;

public class DailySalary implements Salary {
    private int daily=2300;


    @Override
    public int givSalary(int numberDay) {
        return numberDay * daily;
    }
}
