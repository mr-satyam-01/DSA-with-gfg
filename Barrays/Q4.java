package Barrays;

//print the second maximum number in an array

public class Q4 {
    public static void main(String[] args) {
        int[] x = { 3, 5, 8, 6, 2, 4, 9};
        int max = x[0];
        int secmax = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                secmax = max;
                max = x[i];
            } else if (x[i] < max && x[i] > secmax) {
                secmax = x[i];
            }
        }
        System.out.println("The max : " + max + " The second max : " + secmax);
    }
}


// we found the 