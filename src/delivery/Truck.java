package delivery;

public class Truck extends Vehicle {

    /**
     * Грузовик.
     *
     * @param maxSpeed      максимальная скорость
     * @param cargoCapacity грузоподъёмность
     */
    public Truck(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Грузовик загружен. ");
        super.deliver(destination);
    }
}
