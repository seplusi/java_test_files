package java_misc_examples;


public class strings_pract {
    public static void main(String[] args) {
        String myString = "Hello World";
        int var = myString.length();

        System.out.println("String " + myString + " has " + var + " chars");
        System.out.println("ll exists in string " + myString + ": " + myString.contains("ll"));
    }
}
