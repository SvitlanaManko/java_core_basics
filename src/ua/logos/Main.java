package ua.logos;

import ua.logos.second.MyCalculation;

public class Main {
    public static void main(String[] args) {
        MyCalculation calculation = new MyCalculation();
        System.out.println("'+' " + calculation.add(45, 32));
        System.out.println("'-' " + calculation.minus(44, 123));
        System.out.println("'*' " + calculation.multiply(43, 5));
        System.out.println("'/' " + calculation.divide(76, 23));

    }
}
