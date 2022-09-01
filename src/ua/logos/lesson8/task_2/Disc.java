package ua.logos.lesson8.task_2;

public class Disc {
    private String seasonsDisc;
    private int sizeDisc;

    public void setSeasonsDisc(String seasonsDisc) {
        this.seasonsDisc = seasonsDisc;
    }

    public void setSizeDisc(int sizeDisc) {
        this.sizeDisc = sizeDisc;
    }

    public String getSeasonsDisc() {
        return seasonsDisc;
    }

    public int getSizeDisc() {
        return sizeDisc;
    }

    public void switchToSummer() {
        seasonsDisc = "summer";
    }

    @Override
    public String toString() {
        return "Disc{" +
                "season='" + seasonsDisc + '\'' +
                ", size=" + sizeDisc +
                '}';
    }
}
