public class test_chapter5 {
    public static void main(String[] args) {
        Double dd[] = new Double[12];
        Integer ii[] = {1, 2, 3, 4, 5};
        Double dd1[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        Double sum = 0.0;

        for (Double x: dd1) sum = sum + x;
        System.out.println("Average is " + sum/10);

        String str1[] = {"1t", "2t", "4t", "3t"};
        for (int i=0; i<str1.length; i++) {
            for (int x=0; x < (str1.length-1); x++ ) {
                String swap;
                int ch1 = (int) str1[x].charAt(0);
                int ch2 = (int) str1[x+1].charAt(0);
                if (ch1 > ch2) {
                    swap = str1[x];
                    str1[x] = str1[x+1];
                    str1[x+1] = swap;
                }
                }
            }
        "adicid".indexOf('i');
        "adicid".lastIndexOf('i');
        "I like Java".length();
        "I like Java".charAt(2);
        int x = 0, y;
        y = (x < 10)? 10 : 20;
        
        // Max and min from array of ints
        int min, max;
        Integer numbers[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        min = numbers[0];
        max = numbers[0];
        for (Integer num : numbers) {
            if (num > max) max = num;
            else if (num < min) min = num; 
        }

        System.out.println("gfdsa");
        }
}
