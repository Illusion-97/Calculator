package tdd.dawan.calculator.solid;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    private double amount;
    private int pin;

    public Account(double amount) {
        this.amount = amount;
    }

}
