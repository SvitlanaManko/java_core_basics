package ua.logos;

import java.util.Scanner;

public class HomeTask3 {
        public static void main(String[] args) {
            System.out.print("Enter the words:");
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String[] words = word.split(" ");
            for (int i = 1; i < words.length; i++) {
                if (words[i].charAt(0) == 'a' && (words[i].length() % 2 == 0)) {
                    System.out.println(words[i]);
                }
            }
        }
    }


