public class array_study {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int max=0, min=0;

        for (int i=0; i<10; i++) {
            if (nums[i]>max) {
                max = nums[i];
                continue;
            }
            else if (nums[i]<min) {
                min = nums[i];
                continue;
            }
        }
        System.out.println("Max: " + max + "\nMin: " + min);

        for (int times=0; times<nums.length; times++) {
            for (int i=0; i<(nums.length-1); i++) {
                int swap;
                if (nums[i] > nums[i+1]) {
                    swap = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = swap;
                }
            }
        }
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    
        // other multidimentional arrays init
        int xdim[][] = new int[2][10];
        for (int row=0; row<xdim.length; row++) {
            for (int col=0; col<xdim[0].length; col++) {
                xdim[row][col] = row*xdim[0].length + col;
            }
        }
        for (int row=0; row<xdim.length; row++) {
            for (int col=0; col<xdim[0].length; col++) {
                System.out.println(xdim[row][col]);
            }
        }

        // Irregular multidimentional arrays
        int list[] = new int[10];
        int numbers[] = { 1, 2, 3 };
        int table[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        System.out.println("Length of list is " + list.length);
        System.out.println("Length of numbers is " + numbers.length);
        for (int i=0; i<table.length; i++)
            System.out.println("Length of table " + i + " is " + table[i].length);

        int arr[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
        int sum = 0;
        for (int value[]: arr) {
            for (int x : value) {
                sum = sum + x;
            }
            System.out.println("Array sum = " + sum);
            sum = 0;
        }
        System.out.println("Total sum is " + sum);
    }
}
