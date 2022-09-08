package ua.logos.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterNumber {
    public static int enterAnInteger() {
        int integer;
        System.out.print("Enter an integer:");
        Scanner scan = new Scanner(System.in);
        try {
            integer = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The number you entered is not an integer!");
            return enterAnInteger();
        }
        return integer;
    }

    public static void main(String[] args) {
        int enterAnInteger = enterAnInteger();
        if (enterAnInteger % 2 == 1) {
            System.out.println("Your number is odd!");
        } else {
            System.out.println("Your number is even!");
        }


    }
}
