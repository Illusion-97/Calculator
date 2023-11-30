package tdd.dawan.calculator;

import org.springframework.stereotype.Component;

import java.util.Random;

//@Bean -> Indique à spring qu'il doit créer une instance de cette classe et l'insérer dans son contexte
@Component // extends Bean
public class Randomizer {
    private final Random random = new Random();

    public int getRandomInt() {
        return random.nextInt();
    }

    public Randomizer() {
        System.out.println("\u001B[36mRandomizer.Randomizer\u001B[0m");
    }
}
