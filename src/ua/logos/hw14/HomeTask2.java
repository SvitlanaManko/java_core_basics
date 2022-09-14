package ua.logos.hw14;

import java.util.Scanner;

public class HomeTask2 {
    public void validationEmail() {
        System.out.print("Enter your email:");
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        if (email.contains("@gmail.com")) {
            System.out.println("Email entered correctly!");
        } else {
            System.out.println("Email entered incorrectly!");
            validationEmail();
        }
    }

    public static void main(String[] args) {
        HomeTask2 ht2 = new HomeTask2();
        ht2.validationEmail();


    }
}
