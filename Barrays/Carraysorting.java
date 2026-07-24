package Barrays;

import java.util.Arrays;

public class Carraysorting {
    public static void main(String[] args) {
        int[] x = {3,5,9,1,4,-2,-9};
        print(x);
        Arrays.sort(x);
        print(x);

    }

    public static void print(int[] x) {
        for(int i=0; i<x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
