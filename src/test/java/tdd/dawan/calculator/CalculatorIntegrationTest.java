package tdd.dawan.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
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

    @RepeatedTest(50)
    void givenNothing_whenRandomize_thenReturnTen() {
        int result = calculator.randomize();
        System.out.println("result = \u001B[31m" + result + "\u001B[0m");
        assertTrue(result <= 1000 && result >= 0);
    }

    @BeforeEach
        // Exécute un traitement avant le lancement de chaque méthode de test
    void beforeEach() {
        System.out.println("\u001B[36mCalculatorTest.beforeEach\u001B[0m");
    }

    @AfterEach
        // Each -> d'instance vous permet de gérer les variables de votre classe
    void afterEach() {
        System.out.println("\u001B[36mCalculatorTest.afterEach\u001B[0m");
    }
}
