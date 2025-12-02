public abstract class TwoDShape {
    private double height;
    private double width;
    private String name;

    TwoDShape(double h, double w, String n) {
        height = h;
        width = w;
        name = n;
    }

    TwoDShape(double x, String n) {
        height = x;
        width = x;
        name = n;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    abstract double area();

    void setWidth(double width) { this.width = width; }
    void setHeight(double height) { this.height = height; }
    double getWidth() { return width; }
    double getHeight() { return height; }
    String getName() {return name; }
}
