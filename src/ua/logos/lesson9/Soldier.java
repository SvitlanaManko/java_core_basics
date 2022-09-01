package ua.logos.lesson9;

public abstract class Soldier {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack(Soldier[] target);

    public abstract void damage(int healthDamage);

    public abstract boolean isDead();

}

