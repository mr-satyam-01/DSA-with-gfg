package Amethods;

import java.util.Scanner;

public class c_permutationcombination {

    public static int fact(int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(n-r)*fact(r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }
}


//Here we have made a method to calculate factorial instead of finding the factorial by seperate for loop 