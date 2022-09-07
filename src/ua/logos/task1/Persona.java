package ua.logos.task1;

public class Persona {

    private String name;
    private int age;
    private String email;

    public Persona(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ua.logos.task1.Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
