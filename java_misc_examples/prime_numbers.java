package java_misc_examples;

public class prime_numbers {
    public static void main(String[] args) {
        short i;
        System.out.println("1\n2");
        for (i = 3; i < 100; i++ ) {
            int x, counter = 0;
            for (x=1; x<=i; x++) {
                if (i % x == 0) 
                    counter++;
            }
            if (counter == 2)
                System.out.println(i);
        }
    }
}
