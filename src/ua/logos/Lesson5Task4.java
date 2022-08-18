package ua.logos;

public class Lesson5Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 65, 99, 21, 36, 69, 73, 51, 4, 7, 13, 44};
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("The index of the largest number = " + maxIndex);
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }

        }
        System.out.println("The index of the smallest number = " + minIndex);
    }
}
