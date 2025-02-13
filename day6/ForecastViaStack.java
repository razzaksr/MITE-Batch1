package day6;

import java.util.Arrays;
import java.util.Stack;

public class ForecastViaStack {
    public static int[] predict(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> myStack = new Stack<>();

        for(int index=0;index<arr.length;index++){
            while(!myStack.isEmpty()&&arr[index]>=arr[myStack.peek()]){
                int returned = myStack.pop();
                result[returned] = index - returned;
            }
            myStack.push(index);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] forecase = {73,74,75,71,69,72,76,73};
        // int[] forecase = {30,40,50,60};
        int[] received = predict(forecase);
        System.out.println(Arrays.toString(received));
    }
}
