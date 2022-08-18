package ua.logos;

public class Lesson5Task1 {
    public static void main(String[] args) {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
        for (int i = 0; i < hundred.length; i++) {
            if (hundred[i] % 14 == 0) {
                System.out.print(hundred[i] + ", ");
            }
        }
    }
}

