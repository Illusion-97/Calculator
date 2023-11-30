package tdd.dawan.calculator.solid;

public class Square implements Quadrangle{ /*'extends Rectangle' faux selon liskov*/
    private int h;

    public Square(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    @Override
    public void setH(int h) {
        this.h = h;
    }

}
