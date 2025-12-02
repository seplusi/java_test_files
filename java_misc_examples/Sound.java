package java_misc_examples;
import java.util.Scanner;

public class Sound {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Insert number seconds between 0 and 7.2");
        double time = new Scanner(System.in).nextDouble();
        //float time = keyboard.nextFloat();
        System.out.println("You are " + time*343 + " meters away");
    }
}
