package ua.logos;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        System.out.print("Enter the words:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String[] allWords = word.split(" ");
        for (int i = 1; i < allWords.length; i++) {
            if (allWords[i].length() > allWords[max].length()) {
                max = i;
            }
            if (allWords[i].length() < allWords[min].length()) {
                min = i;
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
