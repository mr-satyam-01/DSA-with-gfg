package Csorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 5};
        int[] result = BubbleSort(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps==0){
                break;
            }
        
        }
        return arr;
    }
}