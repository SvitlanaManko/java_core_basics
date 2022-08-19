package ua.logos;

import java.util.Scanner;

public class ClassTask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int calculator = 0;
        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            sum = sum + number;
            calculator++;

        } while (number != 0);
        System.out.println("The sum of the entered numbers is equal " + sum + " ;");
        System.out.println("The number of entered numbers is equal " + calculator + " ;");
    }
}