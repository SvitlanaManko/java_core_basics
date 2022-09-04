package ua.logos.second;

import ua.logos.first.Numerable;

public class MyCalculation implements Numerable {
    @Override
    public double divide(double a, double b) {
        if (a > b) {
            return a / b;
        } else {
            return b / a;
        }
    }

    @Override
    public int minus(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return (b - a);
        }
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
