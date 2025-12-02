public class varArgsClass {
    static void vaTest(int ... v) {
        int sum = 0;
        System.out.println("Number of int args: " + v.length);
        System.out.println("All args are:");
        for (int i : v) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum og all args is" + sum);
    }

    static void vaTEst(char ... c) {
        System.out.println("Number of char args: " + c.length);
        System.out.println("All args are:");
        for (int i : c) {
            System.out.println((char) i);
        }
    }
}
