package java_misc_examples;

public class loops {
    public static void main(String[] args) {
        int x;
        for (x=0; x<2; x++) {
            System.out.println(x);
        }
        // Double can have a long int aasigned to it
        long a = 1;
        double b = 100;
        b=a;

        double a1=100;
        double b1=3;
        int x1 = (int) (a1/b1);
        byte z1 = (byte) (a1*b1);


        b = 88; // ASCII code for X
        char ch = (char) b;
        System.out.println("ch: " + ch);
        System.out.println("ch: " + ch);
        System.out.println("ch: " + ch);

        //char ch = 'x';
        //String st = "Xap";
        //st = (String) (ch);
        System.out.println("One\nTwo\nThree\n");
    
        int i = 0, r;
        i++;
        ++i;
        r = ++i;
        r = i++;
        r = i--;
        r = --i;
        System.out.println(i);

        int i1 = 1, r1 = 0;

        // The short-circuit operator
        if ((i1 != 1) && (i1 % r1) == 0) 
            System.out.println("fghjkl");

        // here, put label before for statement.
        int y;
        stop1: for(x=0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
                }
            }
        System.out.println();
        // now, put label immediately before {
        for(x=0; x < 5; x++)
        stop2: {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop2;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        // Print even numbers
        for (int num=0; num<=100; num++) {
            if (num == 0 || num%2 != 0) continue;
            else System.out.println(num);
        }
        // Get number factors between 2 and 100.
        for (int num1=2; num1<=100; num1++) {
            System.out.println("Factors of " + num1 + ":");
            for (int num2=2; num2<num1; num2++) {
                if (num1%num2 == 0) System.out.println("\t" + num2);
            }
        }
    }
}