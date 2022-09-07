package ua.logos.task1;

import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scan.next();

        System.out.print("Enter your age: ");
        try {
            int userAge = scan.nextInt();
            if (userAge < 18) {
                throw new UnderAgeException();
            }
            System.out.print("Enter your email: ");
            String userEmail = scan.next();
            boolean isEmailCorrect = userEmail.contains("@");
            if (!isEmailCorrect) {
                throw new IncorrectEmailException();
            }
            Persona persona = new Persona(userName, userAge, userEmail);
            System.out.println(persona);
        } catch (UnderAgeException exceptionAge) {
            System.out.println("This service is available to users over 18 years of age.");
        } catch (IncorrectEmailException exceptionEmail) {
            System.out.println("The email was entered incorrectly");
        }


    }
}
