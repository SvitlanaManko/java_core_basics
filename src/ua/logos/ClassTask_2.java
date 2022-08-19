package ua.logos;

import java.util.Scanner;

public class ClassTask_2 {
    public static void main(String[] args) {
        int sum = 0;
        int calculator = 0;
        Scanner scanner = new Scanner(System.in);
        int numberA;
        int numberB;
        System.out.print("Enter number A: ");
        numberA = scanner.nextInt();
        System.out.print("Enter number B: ");
        numberB = scanner.nextInt();
        if (numberA < numberB) {
            for (int i = numberA + 1; i < numberB; i++) {
                sum = sum + i;
                calculator++;
            }
            System.out.println("The sum of the numbers from " + numberA + " to " + numberB + " is equal " + sum);
            System.out.println("The count of numbers from " + numberA + " to " + numberB + " is equal " + calculator);

        } else {
            for (int i = numberB + 1; i < numberA; i++) {
                sum = sum + i;
                calculator++;
            }
            System.out.println("The sum of the numbers from " + numberB + " to " + numberA + " is equal " + sum);
            System.out.println("The count of numbers from " + numberB + " to " + numberA + " is equal " + calculator);

        }
    }
}
