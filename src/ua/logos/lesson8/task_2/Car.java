package ua.logos.lesson8.task_2;

public class Car {
    private int enginePower;
    private String brand;
    private Disc disc;
    private Cab cab;
    private Helm helm;

    public Car(int enginePower, String brand, Disc disc, Cab cab, Helm helm) {
        this.enginePower = enginePower;
        this.brand = brand;
        this.disc = disc;
        this.cab = cab;
        this.helm = helm;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void boostPower() {
        this.enginePower = this.enginePower * 2;
    }

    @Override
    public String toString() {
        return "Car{" +
                "enginePower=" + enginePower +
                ", brand='" + brand + '\'' +
                ", disc=" + disc +
                ", cab=" + cab +
                ", helm=" + helm +
                '}';
    }
}
