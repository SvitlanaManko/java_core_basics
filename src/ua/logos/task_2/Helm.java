package ua.logos.task_2;

public class Helm {
    private String colorHelm;
    private int diameterHelm;

    public void setColorHelm(String colorHelm) {
        this.colorHelm = colorHelm;
    }

    public void setDiameterHelm(int diameterHelm) {
        this.diameterHelm = diameterHelm;
    }

    public String getColorHelm() {
        return colorHelm;
    }

    public int getDiameterHelm() {
        return diameterHelm;
    }

    public void increaseDiameter() {
        diameterHelm = diameterHelm + 2;
    }


    @Override
    public String toString() {
        return "Helm{" +
                "color='" + colorHelm + '\'' +
                ", size=" + diameterHelm +
                '}';
    }
}

