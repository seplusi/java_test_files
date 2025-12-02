package java_misc_examples;

public class conditions {
    public static void main(String[] args) 
    throws java.io.IOException {
        System.out.println("Insert integer");
        int x; 
        x = (char) System.in.read();

        if (x<10) {
            String var = "Lower than 10";
            System.out.println(var);
        }
        else {
            String var = "Higher than 10";
            System.out.println(var);
        }

        System.out.println("Done");
    }
}
