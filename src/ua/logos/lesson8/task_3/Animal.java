package ua.logos.lesson8.task_3;

public class Animal {

    private String nameOfTheAnimal;
    private int ageOfTheAnimal;
    private int animalSpeed;


    public Animal(String nameOfTheAnimal, int ageOfTheAnimal, int animalSpeed) {
        this.nameOfTheAnimal = nameOfTheAnimal;
        this.ageOfTheAnimal = ageOfTheAnimal;
        this.animalSpeed = animalSpeed;
    }


    public void setNameOfTheAnimal(String nameOfTheAnimal) {
        this.nameOfTheAnimal = nameOfTheAnimal;
    }

    public void setAgeOfTheAnimal(int ageOfTheAnimal) {
        this.ageOfTheAnimal = ageOfTheAnimal;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public String getNameOfTheAnimal() {
        return nameOfTheAnimal;
    }

    public int getAgeOfTheAnimal() {
        return ageOfTheAnimal;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    @Override
    public String toString() {
        return "I am a " + getNameOfTheAnimal() + ", I am " + getAgeOfTheAnimal() + " years old, my speed: " + getAnimalSpeed() + " km/h.";
    }
}