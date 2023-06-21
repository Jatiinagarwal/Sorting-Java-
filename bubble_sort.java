import java.util.*;
public class bubble_sort { 
    public static void bubblesort(int arr[]) {
        int swap = 0;
        for(int turn = 0; turn<arr.length-1 ; turn++) { // it might also be <=arr.length-2;  and j<=arr.length-2-turn;(kyuki 0 se n-2 tak jana hai na)
            for(int j = 0; j<arr.length-1-turn ; j++) { // O(n2) time complexity not a very optimized code 
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                swap++;
            }
        }
        System.out.println("The total number of swaps happened: " + swap);
    }

    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
    }
}