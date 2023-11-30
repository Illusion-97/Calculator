package tdd.dawan.calculator.solid;

public class Liskov {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,2);
        Square square = new Square(4);
        rectangle.setH(10);
        square.setH(10);
    }
}
