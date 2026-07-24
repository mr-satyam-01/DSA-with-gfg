package Barrays;

public class Etraversingand2pointer {
    public static void main(String[] args) {
        int[] x = {3, 5, 8, 6, 2, 4, 9};
        int i = 0;
        int j = x.length - 1;
        while(i<j){
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            i++;
            j--;
        }
        for(int ele : x){
            System.out.print(ele + " ");
        }
    }
}
