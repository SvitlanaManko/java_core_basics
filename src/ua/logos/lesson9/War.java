package ua.logos.lesson9;

public class War {
    public static void main(String[] args) {
        Soldier springer = new Springer("Springer", "mortar", 800);
        Soldier landing = new Landing("Landing", "shotgun", 1000);
        Soldier infantryman = new Infantryman("Infantryman", "automatic rifle", 650);
        System.out.println(springer);
        System.out.println(landing);
        System.out.println(infantryman);
        System.out.println("   WAR !!!\n");
        do {
          springer.attack(new Soldier[]{landing, infantryman});
          landing.attack(new Soldier[]{infantryman, springer});
          infantryman.attack(new Soldier[]{springer, landing});
        } while ((!springer.isDead() && !landing.isDead()) || (!springer.isDead() && !infantryman.isDead()) || (!landing.isDead() && !infantryman.isDead()));

        if (infantryman.isDead() && landing.isDead()) {
            System.out.println("Winner is " + springer.getName());
        } else if (infantryman.isDead() && springer.isDead()) {
            System.out.println("Winner is " + landing.getName());
        } else if (springer.isDead() && landing.isDead()) {
            System.out.println("Winner is " + infantryman.getName());
        }

    }

}
