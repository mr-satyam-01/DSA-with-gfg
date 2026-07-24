package Barrays;

//Q..Multiply odd indexed elements by 2 and add 10 to even indexed number
//---------------------------------------------------------------------
public class Q1 {
    public static void main(String[] args) {
        int[] x = { 3, 4, 5, 6, 7, 8, 9 };
        print(x);
        for (int i = 0; i < x.length; i++) {
            if (i != 0 && i % 2 == 0) {
                x[i] = x[i] + 10;
            } else if (i == 0) {
                x[i] = x[i];
            } else {
                x[i] = x[i] * 2;
            }
        }
        print(x);
    }

    public static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
