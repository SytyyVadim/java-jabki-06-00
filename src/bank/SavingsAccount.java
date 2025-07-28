package bank;

public class SavingsAccount extends Account {
    private double interestRate;

    /**
     * Создаем счет.
     *
     * @param accountNumber номер счёта
     * @param balance       начальный баланс
     * @param interestRate  процентная ставка
     */
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    /**
     * Снятие средств с ограничением: не более 1000 за раз.
     *
     * @param amount сумма снятия
     */
    @Override
    public void withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("Нельзя снимать более 1000 за одну операцию.");
            return;
        }
        super.withdraw(amount);
    }

    /**
     * Начисление процентов на баланс.
     */
    public void applyInterest() {
        double interest = balance * this.interestRate / 100;
        balance += interest;
    }
}
