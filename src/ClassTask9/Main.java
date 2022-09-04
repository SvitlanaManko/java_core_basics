package ClassTask9;

public class Main {
    public static void main(String[] args) {
        HourlySalary hourlySalary = new HourlySalary();
        DailySalary dailySalary = new DailySalary();
        System.out.println(hourlySalary.givSalary(23));
        System.out.println(dailySalary.givSalary(45));
    }
}
