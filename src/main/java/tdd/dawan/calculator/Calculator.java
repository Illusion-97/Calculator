package tdd.dawan.calculator;

public class Calculator {
    public int divide(int a, int b) {
        return b <= 0 ? 0 : a / b;
    }

    public int addition(int a, int b) {
       return a + b;
    }
}
