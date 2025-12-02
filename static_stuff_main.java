public class static_stuff_main {
    public static void main(String[] args) {
        staticData obj1 = new staticData();
        staticData obj2 = new staticData();

        obj1.x = 10;
        obj2.x = 20;
        staticData.y = 20;

        System.out.println(obj1.sum());
        System.out.println(obj2.sum());

        System.out.println(staticData.square(2));

        System.out.println(obj1.y);
        obj1.y = obj1.y + 1;
        System.out.println(obj1.y);
        System.out.println(obj2.y);
    }
}
