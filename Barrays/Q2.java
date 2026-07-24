package Barrays;

import java.util.Scanner;

//Q.. find a given number in the array
//---------------------------------------------------------------------

public class Q2 {
    public static void main(String[] args) {
        int[] x = { 3, 4, 5, 6, 7, 8, 9 };
        int reqnum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find");
        reqnum = sc.nextInt();
        boolean numfound = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == reqnum) {
                numfound = true;
                break;
            }
        }
        System.out.println(numfound ? "your number is in the array" : "Not found");

    }
}
