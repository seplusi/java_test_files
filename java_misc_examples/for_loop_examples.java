package java_misc_examples;

import java.io.IOException;

public class for_loop_examples {
    public static void main(String[] args) throws IOException {
        int i;
        int j;
        for (i=0; i<10; i++) {
            System.out.println(i);
            if (i == 5) break;
        }
        // More complex condition
        for (i=0, j=10; i < 9 & j > 7; i++, j-- ) {
            System.out.println(i + " : " + j);
        }
        // Condition depends on user input#
        for (i=0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Attemp " + i);
        }
        // Declaring vars inside the for loop body
        int sum = 0, fact = 1;
        for (int ii=1; ii<6; ii++) {
            sum = sum + ii;
            fact = fact * ii;
        }
        System.out.println("Sum = " + sum + "\nFactorial = " + fact);
    }
}
