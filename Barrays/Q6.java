package Barrays;

//print the wave array for a sorted array
public class Q6 {

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < x.length - 1; i = (i + 2)) {
            swap(x, i, i + 1);
        }
        for (int ele : x) {
            System.out.print(ele + " ");
        }
    }
}
