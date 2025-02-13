package day6;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// Sliding window maximum

public class HeartRateAnalysis {
    public static int[] findMax(int[] arr, int window){
        int[] result = new int[arr.length-window+1];

        Deque<Integer> myDeque = new LinkedList<>();

        // iterations
        for(int index = 0;index<arr.length;index++){
            // when to pollFirst
            if(!myDeque.isEmpty()&&myDeque.peekFirst()<index-window+1)
                myDeque.pollFirst();
            // when to pollLast
            while(!myDeque.isEmpty()&&arr[index]>=arr[myDeque.peekLast()])
                myDeque.pollLast();
            // add i to last
            myDeque.offerLast(index);
            // store in the result
            if(index>=window-1)
                result[index-window+1]=arr[myDeque.peekFirst()];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] heartRate = {70, 85, 60, 95, 82, 74, 90};
        // int[] heartRate = {72, 80, 75, 90, 85, 92, 88};
        int window = 2;
        // int window = 3;
        int[] received = findMax(heartRate, window);
        System.out.println(Arrays.toString(received));
    }
}
