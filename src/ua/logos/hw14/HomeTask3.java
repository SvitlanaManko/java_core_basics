package ua.logos.hw14;

public class HomeTask3 {
    public static void main(String[] args) {
        String str = "I love Java more then my friend. Java is so beautiful";
        if (str.contains("Java")) {
            System.out.println(str.replaceFirst("Java", "C#"));
            System.out.println(str.replaceAll("Java", "C#"));
        }
    }
}
