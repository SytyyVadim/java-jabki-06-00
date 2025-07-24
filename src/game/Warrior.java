package game;

public class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Мечом в лицо!");
    }

    /**
     * Блокирует часть урона.
     *
     * @param damage исходный урон
     * @return уменьшенный урон
     */
    public int block(int damage) {
        int reduced = damage / 2;
        System.out.println(name + " блокирует удар. Урон снижен до " + reduced);
        return reduced;
    }
}
