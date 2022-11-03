package ua.logos.homework22;

public class Lambda {

    public static void main(String[] args) {
        int numberA = 45;
        int numberB = 33;
        int numberC = 17;

        System.out.println("======Lambda1=======");
        Task lambda1 = (a, b, c) -> {
            if ((a >= b) && (a >= c)) {
                return a;
            } else if ((b >= a) && (b >= c)) {
                return (b);
            } else {
                return (c);
            }
        };
        System.out.println("Max = " + lambda1.calculation(numberA, numberB, numberC));

        System.out.println("======Lambda2=======");
        Task lambda2 = (a, b, c) -> (a + b + c);
        System.out.println("Sum = " + lambda2.calculation(numberA, numberB, numberC));

        System.out.println("======Lambda3=======");
        Task lambda3 = (a, b, c) -> (a + b + c) / 3;
        System.out.println("Average = " + lambda3.calculation(numberA, numberB, numberC));
    }
}
