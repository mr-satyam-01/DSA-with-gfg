package Csorting;

// Find the Mth smallest element using selection sort
public class Q2 {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 0, 7, 4, 3, 7, 1, 4 };
        int m = 4;

        for (int i = 0; i < m; i++) {
            int mindex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[mindex] > nums[j]) {
                    mindex = j;
                }
            }
            int temp = nums[mindex];
            nums[mindex] = nums[i];
            nums[i] = temp;

        }
        System.out.println(nums[m - 1]);

    }
}
// here we did two main things 
// 1. we didn't make any "k" to store the new array instead the "i" had the same trajectory, so we use that instead
// 2. we only sorted the array till "m" position to optimize it


/*
 * this can be done like this as well
 * 
 * Arrays.sort(nums);
 * return nums[k];
 * 
 */