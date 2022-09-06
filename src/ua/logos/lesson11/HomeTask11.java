package ua.logos.lesson11;

import java.util.Scanner;

public class HomeTask11 {
    public static void main(String[] args) {

        System.out.print("Enter mouth: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toUpperCase();
        switch (input) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
            case "APRIL":
            case "MAY":
            case "JUNE":
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                Month inputMonth = Month.valueOf(input);
                System.out.println("1. " + input + " is the month of " + inputMonth.getSeason() + ".");
                System.out.print("2. All " + inputMonth.getSeason() + " months: ");
                for (Month value : Month.values()) {
                    if (inputMonth.getSeason() == value.getSeason()) {
                        System.out.print(value + ", ");
                    }
                }

                System.out.print("\n3. Months, have the same number of days:   ");
                for (Month value : Month.values()) {
                    if (inputMonth.getDay() == value.getDay()) {
                        System.out.print(value + ", ");
                    }
                }

                System.out.print("\n4. Months, have fewer days:   ");
                for (Month value : Month.values()) {
                    if (inputMonth.getDay() > value.getDay()) {
                        System.out.print(value + ", ");
                    }
                }


                System.out.print("\n5. Months, have more days:   ");
                for (Month value : Month.values()) {
                    if (inputMonth.getDay() < value.getDay()) {
                        System.out.print(value + ", ");
                    }
                }

                System.out.print("\n6. ");
                int nextSeasonIndex = (inputMonth.getSeason().ordinal() + 1) % Seasons.values().length;
                System.out.print(Seasons.values()[nextSeasonIndex] + ". ");

                System.out.print("\n7. ");
                int previousSeasonIndex = inputMonth.getSeason().ordinal() - 1;
                if (previousSeasonIndex < 0) {
                    previousSeasonIndex = Seasons.values().length - 1;
                }
                System.out.print(Seasons.values()[previousSeasonIndex] + ". ");

                System.out.print("\n8. ");
                for (Month value : Month.values()) {
                    if (value.getDay() % 2 == 0) {
                        System.out.print(value + ", ");
                    }
                }

                System.out.print("\n9. ");
                for (Month value : Month.values()) {
                    if (value.getDay() % 2 != 0) {
                        System.out.print(value + ", ");
                    }
                }

                System.out.print("\n10. ");
                if (inputMonth.getDay() % 2 == 0) {
                    System.out.println("This month hes an even number of days.");
                } else {
                    System.out.println("This month hes an odd number of days.");
                }
                break;
            default:
                System.out.println("ERROR!");
        }

    }
}