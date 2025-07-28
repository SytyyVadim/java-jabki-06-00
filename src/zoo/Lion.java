package zoo;

public class Lion extends Animal {

    /**
     * Лев.
     *
     * @param name имя
     * @param age  возраст
     */
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("p p p p !");
    }

    public void hunt() {
        System.out.println("Охота на на свой хвост");
    }
}
