package ua.logos.hw14;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        System.out.print("Enter words:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String[] words = word.split(" ");
        for (String s : words) {
            if (s.charAt(0) == 'a') {
                System.out.print("Words that start with 'a':" + s + " ");
            }
        }
    }
}
