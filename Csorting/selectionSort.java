package Csorting;

public class selectionSort {
    public static void main(String[] args) {
    
    int[] nums = {3,5,8,2,1,4,9};

    int k = 0;
    for(int i=0; i<nums.length; i++){
        int mindex = i;
        for(int j=i; j<nums.length; j++){
            if(nums[mindex]>nums[j]){
                mindex = j;
            }
        }
        int temp = nums[mindex];
        nums[mindex] = nums[k];
        nums[k] = temp;
        k++;
    }
    for (int ele : nums) {
    System.out.print(ele + " ");
}
}
}
