package tdd.dawan.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorIntegrationTest {

    @Autowired
    Calculator calculator;

    @Test
    void randomizerNotNull() {
        // Ce type de test assez particulier permettant de vérifier la bonne création d'un objet Autowired,
        // Et la présence de ses dépendances ne nécessite pas de phase Arrange et Act, puisque celles-ci sont faites par Spring
        assertNotNull(calculator.getRandomizer());
    }
}
