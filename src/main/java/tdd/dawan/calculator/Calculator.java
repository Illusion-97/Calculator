package tdd.dawan.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Randomizer randomizer;

    //@Autowired pas nécessaire, mais il indique à Spring, que les instances d'objets nécessaires au constructeur
    // doivent se trouver dans son contexte
    public Calculator(Randomizer randomizer) {
        System.out.println("\u001B[36mCalculator.Calculator\u001B[0m");
        this.randomizer = randomizer;
    }

    public int divide(int a, int b) {
        return b <= 0 ? 0 : a / b;
    }

    public int addition(int a, int b) {
       return a + b;
    }

    public int randomize() {
        return randomizer.getRandomInt();
    }

    @Override
    public String toString() {
        return "I'm a super calculator !";
    }

    public Randomizer getRandomizer() {
        return randomizer;
    }
}