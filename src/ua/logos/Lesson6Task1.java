package ua.logos;

import java.util.Scanner;

public class Lesson6Task1 {
    public static void main(String[] args) {
        double amountOfMoney;
        double interestRate;
        double numbersOfYears;
        double depositAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of money($): ");
        amountOfMoney = scanner.nextDouble();
        System.out.print("Enter interest rate(%): ");
        interestRate = scanner.nextDouble();
        System.out.print("Enter numbers of years: ");
        numbersOfYears = scanner.nextDouble();
        depositAmount = amountOfMoney * Math.pow((1+(interestRate/100)),numbersOfYears);
        System.out.print("The amount of your deposit for " + numbersOfYears + " years equal: " + depositAmount+"$");
    }
}