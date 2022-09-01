package ua.logos.lesson9;

public class Landing extends Soldier {

    private String weapon;
    private int health;

    public Landing(String name, String weapon, int health) {
        setName(name);
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Soldier: " + getName() + "\n" +
                "Weapon: " + weapon + "\n" +
                "Health: " + health + "\n";
    }


    @Override
    public void attack(Soldier[] target) {
        for (Soldier soldier : target) {
            if (!isDead() && !soldier.isDead()) {
                System.out.println(getName() + " attacked " + soldier.getName());
                soldier.damage(300);
            }
        }
    }

    @Override
    public void damage(int healthDamage) {
        health = health - healthDamage;
        if (health <= 0) {
            System.out.println(getName() + "is dead ! ");
        } else {
            System.out.println(getName() + " health: " + health + "\n");
        }
    }

    public boolean isDead() {
        return health <= 0;
    }
}