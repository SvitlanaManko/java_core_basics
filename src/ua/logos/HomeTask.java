package ua.logos;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        ArrayList<String> array = scanListOfWords();
        printListOfWords(array);
        printListOfWordsBeginWithS(array);
        printListOfWordsLengthFiveAndMore(array);
    }


    public static ArrayList<String> scanListOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        ArrayList<String> arrayList = new ArrayList<>();
        String scanned;
        do {
            scanned = scanner.nextLine();
            arrayList.add(scanned);
        } while (!scanned.equalsIgnoreCase("break"));
        return arrayList;
    }

    public static void printListOfWords(ArrayList<String> array) {
        System.out.print("Entered words: ");
        for (String word : array) {
            System.out.print(word + ", ");
        }
    }

    public static void printListOfWordsBeginWithS(ArrayList<String> array) {
        System.out.print("\nThese words begin with the letter 's': ");
        for (String word : array) {
            if (word.startsWith("s")) {
                System.out.print(word + ", ");
            }
        }
    }

    public static void printListOfWordsLengthFiveAndMore(ArrayList<String> array) {
        System.out.print("\nWords longer then 5 letters: ");
        for (String word : array) {
            if (word.length() >= 5) {
                System.out.print(word + ", ");
            }
        }
    }
}