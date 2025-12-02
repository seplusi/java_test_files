public class ShapesClass {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        RectangleClass r1 = new RectangleClass(5.0, 5.0);

        System.out.println("Info for r1: ");
        System.out.println("Area is " + r1.area());
        System.out.println(r1.isSquare());

        TwoDShape shapes[] = new TwoDShape[3];
        shapes[0] = new Triangle("Triangle", 8.0, 12.0);
        shapes[1] = new RectangleClass(10);
        shapes[2] = new RectangleClass(10.0, 4.0);
        for (int i=0; i<shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
