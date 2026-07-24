package Barrays;

// rotate array from left (d=3)

public class FrotateArray {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
System.out.println();
    }

    public static void main(String[] args) {
        int[] x = { 3, 5, 8, 6, 2, 4, 9 };
        int d = 3;
        reverse(x, 0, d - 1);
        reverse(x, d, x.length - 1);
        reverse(x, 0, x.length - 1);

    }
}


// Rotate array : it means rotating a part of array from left to right or right to left according to the d given like here d=3
// we created a reverse method 
// first reverse the left element according to given d=3
// then reverese the leftover in the array 
// now finally reverse the whole array which is eventually the thing we need