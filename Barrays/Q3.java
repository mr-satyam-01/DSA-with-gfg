package Barrays;

//Q: Find the two sum for the target 13

public class Q3 {
    public static void main(String[] args) {
        int[] x = { 3, 5, 8, 6, 2, 4 };
        int target = 13;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                int sum = x[i] + x[j];
                if (sum == target) {
                    System.out.println("The target is found: " + x[i] + " " + x[j]);
                }
            }
        }
    }
}
