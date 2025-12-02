package java_misc_examples;

import java.util.Scanner;

public class help {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Help on:\n\t1. if\n\t2. switch\nChoose one:");
        int x = scanner.nextInt();
        switch(x) {
            case 1:
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("The switch:\n");
                System.out.println("swit ch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Incorrect option selected");
        }
        scanner.close();
    }
}
