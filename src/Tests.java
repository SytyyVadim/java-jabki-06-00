import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import bank.*;
import delivery.*;
import zoo.*;
import game.*;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    @Test
    void testBankAccounts() {
        SavingsAccount sa = new SavingsAccount("TST-RU-001", 1000, 5.0);
        sa.deposit(500);
        sa.withdraw(200);
        sa.withdraw(1500);
        sa.applyInterest();

        assertEquals(1365.0, sa.getBalance(), 0.001);

        CreditAccount ca = new CreditAccount("TST-RU-002", 0, 1000);
        ca.withdraw(500);
        ca.withdraw(600);
        ca.deposit(700);

        assertEquals(200.0, ca.getBalance(), 0.001);
    }

    @Test
    void testDeliverySystem() {
        Vehicle truck = new Truck(90, 4000);
        Vehicle drone = new Drone(60, 30);

        assertDoesNotThrow(() -> truck.deliver("MOI"));
        assertDoesNotThrow(() -> drone.deliver("KLF"));
    }

    @Test
    void testZooSounds() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Рыжик", 6));
        animals.add(new Parrot("Наглый", 3));

        for (Animal a : animals) {
            assertDoesNotThrow(a::makeSound);  // Проверим, что звук можно издать
        }
    }

    @Test
    void testGameCharacters() {
        Warrior w = new Warrior("Пушкин", 120);
        Mage m = new Mage("Донтес", 70);

        m.takeDamage(w.block(30)); // 15 урона
        assertEquals(55, m.getHealth());

        w.takeDamage(w.block(40)); // 20 урона
        assertEquals(100, w.getHealth());

        m.heal(20);
        assertEquals(75, m.getHealth());
    }
}
