package Csorting;

import java.util.Arrays;

//Two sum using selection sort ?
//===============================
public class Q1 {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 6, 9, 3, 5, 1 };
        int target = 9;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if ((nums[i] + nums[j]) > 9) {
                j--;
            } else if ((nums[i] + nums[j]) < 9) {
                i++;
            } else {
                System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                break;
            }
        }
    }
}
