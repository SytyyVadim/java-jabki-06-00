package zoo;

public class Parrot extends Animal {

    /**
     * Попугай.
     *
     * @param name имя
     * @param age  возраст
     */
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Свистать всех на верх!");
    }
}
