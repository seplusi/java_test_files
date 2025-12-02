public class RectangleClass extends TwoDShape{
    RectangleClass(double h, double w) {
        super(h, w, "Rectangle");
    }

    RectangleClass(double x) {
        super(x, x, "Rectangle");
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        else return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
