import bank.*;
import delivery.*;
import zoo.*;
import game.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void startDelivery(Vehicle vehicle, String address) {
        vehicle.deliver(address);
    }

    public static void main(String[] args) {

        //ЗАДАЧА 1
        System.out.println("*** Банковские счета ***");

        Account acc1 = new SavingsAccount("RU-001", 5000, 3.5);
        Account acc2 = new CreditAccount("RU-002", 1000, 2000);

        acc1.displayInfo();
        acc2.displayInfo();

        System.out.println("\nПополнение и снятие:");
        acc1.deposit(500);
        acc1.withdraw(1200);
        acc2.withdraw(2500);
        acc2.withdraw(1000);

        System.out.println("\nПосле операций:");
        acc1.displayInfo();
        acc2.displayInfo();

        System.out.println("\nПрименение процентов:");
        if (acc1 instanceof SavingsAccount) {
            ((SavingsAccount) acc1).applyInterest();
        }
        acc1.displayInfo();

        //ЗАДАЧА 2
        System.out.println("\n*** Система доставки ***");

        Vehicle truck = new Truck(100, 5000);
        Vehicle drone = new Drone(60, 20);

        startDelivery(truck, "Красная площадь, дом9, Москва, Россия");
        startDelivery(drone, "Московский Кремль ул. Воздвиженка, д. 1, Москва, Россия");

        //ЗАДАЧА 3
        System.out.println("\n*** Зоопарк ***");

        List<Animal> zooEnclosure = new ArrayList<>();
        zooEnclosure.add(new Lion("Блохастый", 5));
        zooEnclosure.add(new Parrot("Полундра", 2));

        for (Animal animal : zooEnclosure) {
            animal.makeSound();
        }

        //ЗАДАЧА 4
        System.out.println("\n*** Битва персонажей ***");

        Warrior warrior = new Warrior("Чак", 100);
        Mage mage = new Mage("Брюс", 80);

        System.out.println("\nХод 1:");
        warrior.attack();
        mage.takeDamage(warrior.block(20)); // атака по магу с блоком (демо)

        System.out.println("\nХод 2:");
        mage.attack();
        int damageToWarrior = 30;
        warrior.takeDamage(warrior.block(damageToWarrior));

        System.out.println("\nХод 3:");
        mage.heal(15);
    }
}
