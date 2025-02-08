package day2;

public class FindMaxSubProfitDays {

    // divide the array 
    public static int findMaxSubCluster(int[] arr, int start, int end){
        if(start == end)
            return arr[start];
        int mid = start+(end-start)/2;
        int leftSum = findMaxSubCluster(arr, start, mid);
        int rightSum = findMaxSubCluster(arr, mid+1, end);
        int crossSumValue = crossSum(arr, start, mid, end);
        return Math.max(Math.max(leftSum,rightSum), crossSumValue);
    }

    public static int crossSum(int[] arr, int start, int mid, int end){
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int totalSum= 0 ;
        for(int index = mid;index>=start;index--){
            totalSum+=arr[index];
            if(totalSum>leftSum){
                leftSum=totalSum;
            }
        }
        totalSum= 0 ;
        for(int index = mid+1;index<=end;index++){
            totalSum+=arr[index];
            if(totalSum>rightSum){
                rightSum=totalSum;
            }
        }
        return leftSum+rightSum;
    }

    public static void main(String[] args) {
        int[] profits = {-2, 1, 3, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSubCluster(profits, 0, profits.length-1));
    }
}
