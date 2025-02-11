package day4;

import java.util.Arrays;

public class OnlineBiddingQuickSelect {
    
    public static int findKthLargest(int[] arr, int users){
        int selected = arr.length-users;
        return quickSelect(arr, 0, arr.length-1, selected);
    }

    public static int quickSelect(int[] arr, int start, int end, int k){
        if(start==end)
            return arr[start];
        int piPoint = getPivotal(arr, start, end);
        if(piPoint==k)
            return arr[piPoint];
        else if(piPoint<k)
            return quickSelect(arr, piPoint+1, end, k);
        else
            return quickSelect(arr, start, piPoint, k);
    }

    public static int getPivotal(int[] arr, int start, int end){
        int init = start;
        int pivotData = arr[end];

        for(int j=start;j<end;j++){
            if(arr[j]<pivotData){
                int temp = arr[j];
                arr[j]=arr[init];
                arr[init]=temp;
                init++;
            }
        }

        // swap between end and init
        int temp = arr[end];
        arr[end]=arr[init];
        arr[init]=temp;

        return init;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println("Kth Largest Element: " + findKthLargest(nums, k));
        System.out.println(Arrays.toString(nums));
    }

}
