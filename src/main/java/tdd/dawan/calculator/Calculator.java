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


    /*
    1000 >= Retour >= 0
    */
    public int randomize() {
        int randomInt = randomizer.getRandomInt();
        if (randomInt > 1000) return 1000;
        return Math.max(randomInt, 0);
    }

    @Override
    public String toString() {
        return "I'm a super calculator !";
    }

    public Randomizer getRandomizer() {
        return randomizer;
    }
}
