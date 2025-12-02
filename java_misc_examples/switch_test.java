package java_misc_examples;
import java.util.Scanner;


public class switch_test {
    public static void main(String[] args) 
    throws java.io.IOException {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Insert any integer number between 0 and 3");
        int x = scanner.nextInt();
        switch(x) {
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            default: {
                if (x < 0) System.out.println("Number is negative");
                else {
                    System.out.println("Number is higher than 3");
                }
                }
        scanner.close();
        }
    }
}
