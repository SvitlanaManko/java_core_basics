package ua.logos;

public class HomeTask1 {
    public static void main(String[] args) {
        String str = "I like java !!!";
        System.out.println("1.) " + str);
        System.out.println("2.) " + str.charAt(str.length() - 1));
        System.out.println("3.) " + str.endsWith("!!!"));
        System.out.println("4.) " + str.startsWith("I like"));
        System.out.println("5.) " + str.contains("java"));
        System.out.println("6.) " + str.indexOf("java"));
        System.out.println("7.) " + str.replace('a', 'o'));
        System.out.println("8.) " + str.toUpperCase());
        System.out.println("9.) " + str.toLowerCase());
        System.out.println("10.)" + str.substring(7, 11));
    }

}

