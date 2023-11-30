package tdd.dawan.calculator.solid;

public class Rectangle implements Quadrangle, IndependantHW{
    private int h,w;

    public Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }


}
