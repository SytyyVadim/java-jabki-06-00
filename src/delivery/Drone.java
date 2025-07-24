package delivery;

public class Drone extends Vehicle {

    /**
     * Дрон.
     *
     * @param maxSpeed      максимальная скорость
     * @param cargoCapacity грузоподъёмность
     */
    public Drone(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Дрон взлетел. ");
        super.deliver(destination);
    }
}
