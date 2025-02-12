package day5;

public class MaxSumSubViaSW {

    public static void findCluster(int[] arr, int window){

        int windowSum = 0, maxSum = 0;
        // finding first window size sum in array
        for(int index = 0; index<window;index++){
            windowSum += arr[index];
        }

        maxSum=windowSum;

        // sliding the window till end of array
        for(int index = window; index<arr.length;index++){
            windowSum += arr[index]-arr[index-window];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] transactions = {800,1200,4500,320,600,800,560,4500,12000,320};
        int windowSize = 3;
        findCluster(transactions, windowSize);
    }
}
