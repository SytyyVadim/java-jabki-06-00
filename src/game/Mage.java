package game;

public class Mage extends Character {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Огненный шар!");
    }

    /**
     * Лечит себя на указанное количество здоровья.
     *
     * @param amount количество лечения
     */
    public void heal(int amount) {
        if (amount > 0) {
            health += amount;
            System.out.println(name + " исцеляется на " + amount + ". Текущее здоровье: " + health);
        }
    }
}
