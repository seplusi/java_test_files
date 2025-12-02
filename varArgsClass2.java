public class varArgsClass2 {
    static void vaTest(int a, int b, int ... v) {
        System.out.println("Number of args: " + (v.length + 2));
        System.out.println("All variable args are:");
        for (int i : v) {
            System.out.println(i);
        }
    }
}
