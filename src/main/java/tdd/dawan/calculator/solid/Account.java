package tdd.dawan.calculator.solid;


public class Account {
    private double amount;
    private int pin;

    public Account(double amount) {
        this.amount = amount;
    }

    public Account(double amount, int pin) {
        this(amount);
        this.pin = pin;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
