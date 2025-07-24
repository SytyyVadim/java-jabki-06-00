package delivery;

public class Vehicle {
    protected int maxSpeed;
    protected int cargoCapacity;

    /**
     * Транспортное средства.
     *
     * @param maxSpeed       максимальная скорость
     * @param cargoCapacity  грузоподъёмность
     */
    public Vehicle(int maxSpeed, int cargoCapacity) {
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Доставка по адресу.
     *
     * @param destination пункт назначения
     */
    public void deliver(String destination) {
        System.out.println("Доставка в " + destination);
    }
}
