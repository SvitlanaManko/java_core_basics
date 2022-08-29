package ua.logos.task_2;

public class Cab {
    private String colorCab;
    private int heightOfCab;

    public void setColorCab(String colorCab) {
        this.colorCab = colorCab;
    }

    public void setHeightOfCab(int heightOfCab) {
        this.heightOfCab = heightOfCab;
    }

    public String getColorCab() {
        return colorCab;
    }

    public int getHeightOfCab() {
        return heightOfCab;
    }

    public void paintCabToBlack() {
        colorCab = "black";
    }

    @Override
    public String toString() {
        return "Cab{" +
                "color='" + colorCab + '\'' +
                ", height=" + heightOfCab +
                '}';
    }
}
