package ua.logos;

import java.util.Scanner;

public class ClassTask_3 {
    public static void main(String[] args) {
        int number;
        int zero = 0;
        int positive = 0;
        int negative = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers from -100 to 100:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number = scanner.nextInt();
            if (number < 0) {
                negative++;
            } else if (number > 0) {
                positive++;
            } else {
                zero++;
            }
        }
        System.out.println("Count the negatives numbers equal: " + negative + ";");
        System.out.println("Count the positives numbers equal: " + positive + ";");
        System.out.println("Count the zero equal: " + zero + ";");

    }
}
