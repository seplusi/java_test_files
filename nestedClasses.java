public class nestedClasses {
    int nums[];

    nestedClasses(int n[]) {
        nums = n;
    }

    class innerClass {
        int min() {
            int min = nums[0];
            for (int i : nums) {
                if (i < min) min = i; 
            }

            return min;
        }

        int max() {
            int max = nums[0];
            for (int i : nums) {
                if (i > max) max = i;
            }
            return max;
        }

        double avrg() {
            int sum = 0;
            for (int i : nums) {
                sum = sum + i;
            }
            return sum/nums.length;
        }

    }

    void analyze() {
        innerClass inobj = new innerClass();

        System.out.println("Min = " + inobj.min());
        System.out.println("Max = " + inobj.max());
        System.out.println("Avrg = " + inobj.avrg());
    }
}
