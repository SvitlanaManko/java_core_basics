package ua.logos;

import java.util.Scanner;

public class Lesson6Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + numbers.length + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

        }
        System.out.print("Array of your numbers: { ");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + "; ");
            } else {
                System.out.print(numbers[i] + " }");
            }
        }
        System.out.println();
        System.out.print("Array of your numbers in reverse order: { ");
        for (int i = numbers.length - 1; i >= 0; i--) {

            if (i > 0) {
                System.out.print(numbers[i] + "; ");
            } else {
                System.out.print(numbers[i] + " }");
            }
        }

    }
}
