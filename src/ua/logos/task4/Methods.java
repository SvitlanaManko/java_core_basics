package ua.logos.task4;

import ua.logos.task2.EnterNumber;

public class Methods {
    double number1;
    double number2;

    public Methods(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    double plus() {
        return number1 + number2;
    }

    double minus() {
        return number1 - number2;
    }

    double multiply() {
        return number1 * number2;
    }

    double davide() {
        return number1 / number2;
    }

    public static void main(String[] args) {
        System.out.println("Enter two integer numbers: ");
        try {
            double number1 = EnterNumber.enterAnInteger();
            double number2 = EnterNumber.enterAnInteger();
            if (number1 < 0 && number2 < 0) {
                System.out.println("IllegalArgumentException!");
                throw new IllegalArgumentException();
            }
            if ((number1 == 0 && number2 != 0) || (number1 != 0 && number2 == 0)) {
                System.out.println("ArithmeticException!");
                throw new ArithmeticException();
            }
            if (number1 == 0 && number2 == 0) {
                System.out.println("IllegalAccessException!");
                throw new IllegalAccessException();
            }
            //if (number1 > 0 && number2 > 0) {
            //  System.out.println("MyException");
            // throw new MyException();
            // }
            Methods methods = new Methods(number1, number2);
            System.out.println((int) number1 + "+" + (int) number2 + "=" + (int) methods.plus());
            System.out.println((int) number1 + "-" + (int) number2 + "=" + (int) methods.minus());
            System.out.println((int) number1 + "*" + (int) number2 + "=" + (int) methods.multiply());
            System.out.println((int) number1 + "/" + (int) number2 + "=" + methods.davide());
        } catch (IllegalArgumentException e) {

        } catch (ArithmeticException e) {

        } catch (IllegalAccessException e) {

            // } catch (MyException e) {
        }
    }
}
