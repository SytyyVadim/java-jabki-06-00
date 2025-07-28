package zoo;

public class Animal {
    protected String name;
    protected int age;

    /**
     * Зверь.
     *
     * @param name имя
     * @param age  возраст
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("ку ку");
    }

    public void eat() {
        System.out.println(this.name + " чавкает чав чав");
    }
}
