package ua.logos.task3;

import ua.logos.task2.EnterNumber;

public class EnterTwoNumbers {

    public static void main(String[] args) {
        System.out.println("Enter two integer numbers: ");
        int integer1 = EnterNumber.enterAnInteger();
        int integer2 = EnterNumber.enterAnInteger();
        int sum = integer1 + integer2;
        System.out.println(integer1 + "+" + integer2 + "=" + sum);
    }
}
