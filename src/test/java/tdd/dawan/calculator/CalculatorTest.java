package tdd.dawan.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test // Je vais écrire une méthode de test
    void givenOneAndOne_whenDivide_thenReturnOne() {
        // LES 3 A (les 3 étapes d'un test)

        // Arrange : étape d'initialisation des données du test
        int a = 1, b = 1, expected = 1;

        // Act : récupération du retour de la méthode à tester
        int result = new Calculator().divide(a,b);

        // Assert : vérification de la correspondance du résultat
        assertEquals(expected, result); // Il est important de respecter l'ordre pour la compréhension des résultats
    }

    @Test
    void givenAIsOneAndBIsNegativeOne_whenDivide_thenReturnZero() {
        int a = 1, b = -1, expected = 0;

        int result = new Calculator().divide(a,b);

        assertEquals(expected, result);
    }

    @Test
    void givenAIsOneAndBIsZero_whenDivide_thenReturnZero() {
        int a = 1, b = 0, expected = 0;

        int result = new Calculator().divide(a,b);

        assertEquals(expected, result);
    }

    @Test
    void givenAIsOneANDBIsOne_whenAddition_thenReturnTwo() {
        int a = 1, b = 1, expected = 2;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);
    }

    @Test
    void givenAIsTwoAndBIsOne_whenAddition_thenReturnThree() {
        int a = 2, b = 1, expected = 3;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);

    }

    @Test
    void givenAIsTwoAndBIsTwo_whenAddition_thenReturnFour() {
        int a = 2, b = 2, expected = 4;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);

    }

    @Test
    void givenAIsThreeAndBIsTwo_whenAddition_thenReturnFive() {
        int a = 3, b = 2, expected = 5;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);

    }
    @Test
    void givenAIsFiveAndBIsSeven_whenAddition_thenReturnTwelve() {
        int a = 5, b = 7, expected = 12;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);

    }
    @Test
    void givenAIsFourAndBIsEight_whenAddition_thenReturnTwelve() {
        int a = 4, b = 8, expected = 12;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);
    }

    @Test
    void givenAIsTwoAndBIsNegativeTwo_whenAddition_thenReturnTwelve() {
        int a = 2, b = -2, expected = 0;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);
    }

    @Test
    void givenAIsNegativeTwoAndBIsNegativeTwo_whenAddition_thenReturnTwelve() {
        int a = -2, b = -2, expected = -4;

        int result = new Calculator().addition(a,b);

        assertEquals(expected,result);
    }
}
