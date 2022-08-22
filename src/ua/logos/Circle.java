package ua.logos;

import java.util.Scanner;

public class Circle {
    double radius;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }

    public void printArea() {
        double area = Math.PI / 4 * diameter * diameter;
        System.out.println("Area of a circle   = " + area + ";");
    }

    public void printLength() {
        double length = 2 * Math.PI * radius * radius;
        System.out.println("Length of a circle = " + length + ";");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();

        Circle circle = new Circle(r);
        circle.printArea();
        circle.printLength();
    }

}
