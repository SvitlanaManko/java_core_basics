package ua.logos.task_2;

public class HomeTask2 {
    public static void main(String[] args) {
        Disc disc = new Disc();
        disc.setSeasonsDisc("winter");
        disc.setSizeDisc(5);
        disc.switchToSummer();
        System.out.println(disc);

        Cab cab = new Cab();
        cab.setColorCab("pink");
        cab.setHeightOfCab(120);
        cab.paintCabToBlack();
        System.out.println(cab);

        Helm helm = new Helm();
        helm.setColorHelm("black");
        helm.setDiameterHelm(37);
        helm.increaseDiameter();
        System.out.println(helm);

        Car car = new Car(155, "BMV", disc, cab, helm);
        car.boostPower();
        System.out.println(car);

    }
}
