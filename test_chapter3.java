import java.io.IOException;

public class test_chapter3 {
    public static void main(String[] args) throws IOException {
        // Question1
        char typedVar;
        int counter = 0;
        do {
            typedVar = (char) System.in.read();
            if (typedVar == ' ') counter++;
        } while(typedVar != '.');
        System.out.println("Number of spaces is " + counter);
        // Question2
        int r = 2;
        if (r > 2) System.out.println(r + " is bigger than 2");
        else if (r < 2) System.out.println(r + " is smaller than 2");
        else System.out.println(r + " is 2");
        // Question3
        int x = 11;
        int y = 99;
        int z = 69;
        boolean done = false;
        if(x < 10)
            if(y > 100) {
                if(!done) x = z;
                else y = z;
                }
            else x = z;
        else System.out.println("error"); // what if?
        // Question4
        for (int dec=1000; dec>=0; dec=dec-2)
            System.out.println(dec);
        // Question8
        for(int i = 0; i<10; i++) {
            System.out.print(i + " ");
            if((i%2) == 0) continue;
            System.out.println();
        }
        // Question9
        int fact;
        for (fact=1; fact<1000; fact=fact+fact) 
            System.out.println(fact);
        // Question10
        int l2u=0, u2l=0;
        int typedChar;
        do {
            typedChar = System.in.read();
            if (typedChar >= 65 & typedChar <= 90) {
                System.out.println("Converting uppercase " + (char) typedChar + " to lowercase " + (char) (typedChar + 32));
                u2l++;
            }
            else if (typedChar >= 97 & typedChar <= 122) {
                System.out.println("Converting lowercase " + (char) typedChar + " to uppercase " + (char) (typedChar - 32));
                l2u++;
            }
        } while ((char) typedChar != '.');
        System.out.println("l2u = " + l2u + "\nu2l = " + u2l);
    }
}
