package ua.logos;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        length = 13;
        width = 7;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return (length + width) * 2;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(8, 10);
        System.out.println("Perimeter of a triangle 1 = " + rectangle1.area() + ";");
        System.out.println("Area of a triangle 1 = " + rectangle1.perimeter() + ";");

        Rectangle rectangle2 = new Rectangle();
        System.out.println("Perimeter of a triangle 2 = " + rectangle2.area() + ";");
        System.out.println("Area of a triangle 2 = " + rectangle2.perimeter() + ";");
    }

}
