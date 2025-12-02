public class Circle extends TwoDShape{
    double radius;

    Circle(double x) {
        super(x, "Circle");
        radius = x/2;
    }

    double area() {
        return 3.14*radius*radius;
    }
}
