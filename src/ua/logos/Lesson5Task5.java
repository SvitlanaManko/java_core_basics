package ua.logos;

public class Lesson5Task5 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{54, 35, 78, 98, 31, 91, 56, 29, 84, 91};
        int[] arrayB = new int[]{21, 12, 34, 76, 2, 77, 41, 12, 11, 87};
        int[] arrayC = new int[10];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] - arrayB[i];
            System.out.print(arrayC[i] + ", ");

        }
    }
}
