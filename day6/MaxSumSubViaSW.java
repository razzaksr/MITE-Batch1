package day6;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubViaSW {

    public static List<Integer> findCluster(int[] arr, int window){

        int windowSum = 0, maxSum = 0;
        // finding first window size sum in array
        for(int index = 0; index<window;index++){
            windowSum += arr[index];
        }

        maxSum=windowSum;
        int start =0;

        // sliding the window till end of array
        for(int index = window; index<arr.length;index++){
            windowSum += arr[index]-arr[index-window];
            // maxSum = Math.max(maxSum, windowSum);
            if(windowSum>=maxSum){
                maxSum=windowSum;
                start = index-window+1;
            }
        }

        List<Integer> windowElements = new ArrayList<>();
        // System.out.println(start);
        for(int index = 0;index<window;index++){
            windowElements.add(arr[start+index]);
        }

        System.out.println(maxSum);

        return windowElements;
    }

    public static void main(String[] args) {
        int[] transactions = {800,1200,4500,320,600,800,560,4500,12000,320};
        int windowSize = 3;
        List<Integer> retured = findCluster(transactions, windowSize);
        System.out.println(retured);
    }
}
