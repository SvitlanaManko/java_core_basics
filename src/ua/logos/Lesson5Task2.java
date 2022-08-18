package ua.logos;

public class Lesson5Task2 {
    static int[] array = new int[]{12, 66, 32, 46, 66, 4, 12, 87, 4, 98};

    public static void main(String[] args) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    System.out.println(array[j] + ", ");
                    break;
                }
            }
        }
    }
}
