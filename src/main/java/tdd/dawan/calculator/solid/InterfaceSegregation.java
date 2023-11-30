package tdd.dawan.calculator.solid;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,2);
        Square square = new Square(4);
        updateH(rectangle,8);
        updateH(square,8);
    }

    private static void updateH(Quadrangle quadrangle, int h) {
        quadrangle.setH(h);
    }
}
