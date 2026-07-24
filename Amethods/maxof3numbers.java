package Amethods;

import java.util.Scanner;

public class maxof3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxi = Math.max(Math.max(a, b), c);
        System.out.println(maxi);
    }
}
