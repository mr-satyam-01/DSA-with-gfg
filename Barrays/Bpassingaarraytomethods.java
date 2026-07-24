package Barrays;

public class Bpassingaarraytomethods {
    public static void main(String[] args) {
        int[] x = {4,5,6,7};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

        
    }
    public static void change(int[] y) {
        y[2] = 23;
    }
}

/* 
shallow copy :  Copies only the reference (address).
----------------------------------------------------
int[] a = {1, 2, 3};
int[] b = a;   // Shallow copy (same array)

b[0] = 100;

System.out.println(a[0]); // 100
System.out.println(b[0]); // 100
*/ 
//---------------------------------------------------
/*
deep copy : Creates a completely new object/array.
----------------------------------------------------
int[] a = {1, 2, 3};
int[] b = a.clone();   // Deep copy (new array)

b[0] = 100;

System.out.println(a[0]); // 1
System.out.println(b[0]); // 100
*/