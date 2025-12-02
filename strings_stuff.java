public class strings_stuff {
    public static void main(String[] args) {
        String str1 = new String("Initialized");
        System.out.println(str1.equals("blah"));
        System.out.println(str1.equals("Initialized"));
        System.out.println(str1.indexOf('z'));
        System.out.println(str1.lastIndexOf('i'));

        // Array of strings
        String strs[] = new String[2];
        String strs1[] = {"Hello", "World"};
        strs[0] = "Hello";
        strs[1] = "World";

        int a = 1;
        int b;
        b = a;
        a= 2;
        System.out.println("cvbnm,");

        // Switch with strings
        String str4switch = "Hello";

        switch (str4switch) {
            case "Hello":
                System.out.println("I got it");
                break;
            case "World":
                System.out.println("Something is wrong");
                break;
            default:
                break;
        }

        for (String val : args) {
            System.out.println(val);
        }
        // ? operator
        int a1 = 1;
        int b1 = 2;
        int c;

        c = a1 > b1 ? a1: b1;
        System.out.println("dfghjkl");
    }
}
