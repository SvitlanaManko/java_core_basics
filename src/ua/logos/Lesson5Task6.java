package ua.logos;

public class Lesson5Task6 {
    public static void main(String[] args) {
        int[] randoms = new int[]{12, 43, 89, 99, 11, 1, 52, 67, 23, 81};
        int intermediate;
        for (int i = 0; i < randoms.length; i++) {
            for (int j = 0; j < randoms.length - 1; j++) {
                if (randoms[j] > randoms[j + 1]) {
                    intermediate = randoms[j + 1];
                    randoms[j + 1] = randoms[j];
                    randoms[j] = intermediate;
                }

            }
        }
        for (int random : randoms) {
            System.out.print(random + ", ");
        }
    }
}

