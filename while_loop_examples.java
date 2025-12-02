import java.io.IOException;

public class while_loop_examples {
    public static void main(String[] args) throws IOException {
        char ch = 'Z';
        System.out.println("Try you luck guessing the right letter");
        while (ch != (char) System.in.read()) {
            System.out.println("You failed. The right letter isn't what you typed. Try again");
        }

        int e = 0;
        while (e <= 9 ) {
            System.out.println(e*e);
            e++;
        }
        do {
            System.out.println("Guess the right letter, again!");
        } while (ch != (char) System.in.read());
    }
}
