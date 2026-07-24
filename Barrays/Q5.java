package Barrays;

//Q. segregte 0 and 1 in an array 

public class Q5 {
    public static void main(String[] args) {
        int[] x = { 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0 };
        int one = 0;
        int zero = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                one++;
            } else if (x[i] == 0) {
                zero++;
            }
        }
        int[] y = new int[x.length];
        for (int i = 0; i < zero; i++) {
            y[i] = 0;
        }
        for (int i = zero; i < x.length; i++) {
            y[i] = 1;
        }
        for (int ele : y) {
            System.out.print(ele + " ");
        }
    }
}

//we first calculated no of zeroes and ones
//then created a new array of same length and fill the zero = no of zeroes and one = no of ones
