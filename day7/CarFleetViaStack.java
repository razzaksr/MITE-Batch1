package day7;

import java.util.Arrays;
import java.util.Stack;

public class CarFleetViaStack {
    public static int fleetToGether(int[] borading, int[] speed, int target){
        // store positions
        Integer[] position = new Integer[borading.length];
        // filling default value in array 0 to 4
        for(int index = 0;index<position.length;index++){
            position[index] = index;
        }
        // sort based on boarding points descending order
        Arrays.sort(position,(a,b)->borading[b]-borading[a]);
        // stack to store time to determine the no of fleets
        // System.out.println(Arrays.toString(position));
        Stack<Double> myStack = new Stack<>();
        for(int each:position){
            double time = (double)(target-borading[each])/speed[each];
            if(myStack.isEmpty()||time>myStack.peek()){
                myStack.push(time);
            }
        }
        return myStack.size();
    }
    public static void main(String[] args) {
        // int[] board = {10,8,0,5,3};
        // int[] speed = {2,4,1,1,3};
        // int target = 12;
        // int[] board = {3};
        // int[] speed = {3};
        // int target = 10;
        int[] board = {0,2,4};
        int[] speed = {4,2,1};
        int target = 100;
        System.out.println(fleetToGether(board, speed, target));
    }
}
