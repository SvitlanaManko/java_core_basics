package ua.logos.lesson8.task_3;

public class HomeTask3 {
    public static void main(String[] args) {
        Animal instance = new Animal("horse", 6, 65);

        System.out.println(instance);
        instance.setNameOfTheAnimal("cheetah");
        instance.setAgeOfTheAnimal(5);
        instance.setAnimalSpeed(80);
        System.out.println(instance);
    }
}
