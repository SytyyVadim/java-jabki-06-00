package bank;

public class Account {
    protected String accountNumber;
    protected double balance;

    /**
     * Создание счёта.
     *
     * @param accountNumber номер счёта
     * @param balance       начальный баланс
     */
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Пополнение счета.
     *
     * @param amount сумма пополнения
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Снятие со счета.
     *
     * @param amount сумма снятия
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }

    public void displayInfo() {
        System.out.println("Счёт: " + accountNumber + ", Баланс: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
