package tdd.dawan.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @Test // Je vais écrire une méthode de test
    void givenOneAndOne_whenDivide_thenReturnOne() {
        // LES 3 A (les 3 étapes d'un test)

        // Arrange : étape d'initialisation des données du test
        int a = 1, b = 1, expected = 1;

        // Act : récupération du retour de la méthode à tester
        int result = calculator.divide(a,b);

        // Assert : vérification de la correspondance du résultat
        assertEquals(expected, result); // Il est important de respecter l'ordre pour la compréhension des résultats
    }

    @Test
    void givenAIsOneAndBIsNegativeOne_whenDivide_thenReturnZero() {
        int a = 1, b = -1, expected = 0;

        int result = calculator.divide(a,b);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("DivideByZero")
    @Disabled("Fixed -> givenAIsOneAndBIsZero_whenDivide_thenReturnZero")
    void givenAIsOneAndBIsZero_whenDivide_thenThrowArithmeticException() {
        int a = 1, b = 0;
        // Class<? extends Throwable> : Je m'attends à récupérer quelque chose qui passe par un throw
        Class<? extends Throwable> expected = ArithmeticException.class;

        // Executable result = () -> calculator.divide(a, b);

        assertThrows(expected, () -> calculator.divide(a, b));

        // assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @DisplayName("DivideByZero")
    void givenAIsOneAndBIsZero_whenDivide_thenReturnZero() {
        int a = 1, b = 0, expected = 0;

        int result = calculator.divide(a,b);

        assertEquals(expected, result);
    }

    @Test
    void givenAIsOneANDBIsOne_whenAddition_thenReturnTwo() {
        int a = 1, b = 1, expected = 2;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);
    }

    @Test
    void givenAIsTwoAndBIsOne_whenAddition_thenReturnThree() {
        int a = 2, b = 1, expected = 3;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);

    }

    @Test
    void givenAIsTwoAndBIsTwo_whenAddition_thenReturnFour() {
        int a = 2, b = 2, expected = 4;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);

    }

    @Test
    void givenAIsThreeAndBIsTwo_whenAddition_thenReturnFive() {
        int a = 3, b = 2, expected = 5;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);

    }
    @Test
    void givenAIsFiveAndBIsSeven_whenAddition_thenReturnTwelve() {
        int a = 5, b = 7, expected = 12;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);

    }
    @Test
    void givenAIsFourAndBIsEight_whenAddition_thenReturnTwelve() {
        int a = 4, b = 8, expected = 12;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);
    }

    @Test
    void givenAIsTwoAndBIsNegativeTwo_whenAddition_thenReturnTwelve() {
        int a = 2, b = -2, expected = 0;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);
    }

    @Test
    void givenAIsNegativeTwoAndBIsNegativeTwo_whenAddition_thenReturnTwelve() {
        int a = -2, b = -2, expected = -4;

        int result = calculator.addition(a,b);

        assertEquals(expected,result);
    }

    @BeforeAll // Exécute un traitement avant le lancement de la classe de test
    static void beforeAll() {
        System.out.println("\u001B[36mCalculatorTest.beforeAll\u001B[0m");
    }

    @BeforeEach // Exécute un traitement avant le lancement de chaque méthode de test
    void beforeEach() {
        System.out.println("\u001B[36mCalculatorTest.beforeEach\u001B[0m");
        calculator = new Calculator(null);
    }

    @AfterEach // Each -> d'instance vous permet de gérer les variables de votre classe
    void afterEach() {
        System.out.println("\u001B[36mCalculatorTest.afterEach\u001B[0m");
    }

    @AfterAll // All - > static (Appartiens à la classe)
    static void afterAll() {
        System.out.println("\u001B[36mCalculatorTest.afterAll\u001B[0m");
    }


}