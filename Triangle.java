public class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h) {
        super(h, w, "Triangle");
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
