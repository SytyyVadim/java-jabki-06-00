package bank;

public class CreditAccount extends Account {
    private double creditLimit;

    /**
     * Создаем кредитны счет.
     *
     * @param accountNumber номер счёта
     * @param balance       начальный баланс
     * @param creditLimit   кредитный лимит
     */
    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    /**
     * Снятие средств.
     *
     * @param amount сумма снятия
     */
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) return;

        if (balance - amount >= -this.creditLimit) {
            double before = balance;
            super.withdraw(amount);

            // Если родитель не списал средства по какой-то причине, можем списать вручную
            if (balance == before) {
                balance -= amount;
            }
        } else {
            System.out.println("Превышен кредитный лимит.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Кредитный, Кредитный лимит: " + creditLimit);
    }
}
