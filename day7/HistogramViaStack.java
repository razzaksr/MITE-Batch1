package day7;

import java.util.Stack;

public class HistogramViaStack {
    public static int findMaxRectArea(int[] arr){
        int maxArea = Integer.MIN_VALUE;

        Stack<Integer> myIntegers = new Stack<>();

        for(int index = 0; index<=arr.length;index++){
            int current = (index==arr.length)?0:arr[index];
            while(!myIntegers.isEmpty()&&current<arr[myIntegers.peek()]){
                int ht = arr[myIntegers.pop()];
                int width = myIntegers.isEmpty()?index:index-myIntegers.peek()-1;
                maxArea = Math.max(maxArea,ht*width);
            }
            myIntegers.push(index);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(findMaxRectArea(heights));
    }
}
