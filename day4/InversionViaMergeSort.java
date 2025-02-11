package day4;
import java.util.Arrays;

public class InversionViaMergeSort {
    public static int mergeAndCount(int[] src, int[] swap, int start, int mid, int end){
        // // inversion Count of each merge
        // int currentInversion = 0;
        // int leftIndex = start, rightIndex=mid+1, swapIndex = start;

        // // comparison
        // while(leftIndex<=mid&&rightIndex<=end){
        //     if(src[leftIndex]>=src[rightIndex]){
        //         swap[swapIndex] = src[rightIndex];
        //         rightIndex++;
        //         currentInversion += (mid-leftIndex+1);
        //     }
        //     else{
        //         swap[swapIndex]=src[leftIndex];
        //         leftIndex++;
        //     }
        //     swapIndex++;
        // }

        // // remianing elements if available we need to copy to swap
        // while(leftIndex<=mid){
        //     swap[swapIndex]=src[leftIndex];
        //     leftIndex++;
        // }
        // while(rightIndex<=end){
        //     swap[swapIndex] = src[rightIndex];
        //     rightIndex++;
        // }

        // // overwrite changes from swap to source
        // for(int index = start; index <= end; index++ ){
        //     src[index] = swap[index];
        // }
        // return currentInversion;
        int inversonCount=0;
        int leftIndex = start, rightIndex = mid+1, current = start;
        while(leftIndex<=mid&&rightIndex<=end){
            if(src[leftIndex]>=src[rightIndex]){
                swap[current]=src[rightIndex];
                rightIndex++;
                inversonCount += (mid-leftIndex+1);
            }
            else{
                swap[current]=src[leftIndex];
                leftIndex++;
            }
            current++;
        }

        while(leftIndex<=mid){
            swap[current]=src[leftIndex];
            leftIndex++;
        }
        while(rightIndex<=end){
            swap[current]=src[rightIndex];
            rightIndex++;
        }

        // replace sorted elements into orginal array
        for(int index = start; index<=end; index++){
            src[index] = swap[index];
        }

        return inversonCount;
    }
    public static int divide(int[] arr, int[] swap, int start, int end){
        // total no of inversion count
        // int totalInversion = 0;
        // if(start<end){
        //     int mid = start+(end-start)/2;
        //     totalInversion += divide(arr, swap, start, mid);
        //     totalInversion += divide(arr, swap, mid+1, end);
        //     totalInversion += mergeAndCount(arr, swap, start, mid, end);
        // }
        // return totalInversion;
        int inversion = 0;
        if(start<end){
            int mid = start+(end-start)/2;
            inversion += divide(arr, swap, start, mid);
            inversion += divide(arr, swap, mid+1, end);
            inversion += mergeAndCount(arr, swap, start, mid, end);
        }
        return inversion;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,6,4};
        int[] temp = new int[arr.length];// temporary
        System.out.println(divide(arr, temp, 0, arr.length-1));
        System.out.println(Arrays.toString(arr));
    }
}
