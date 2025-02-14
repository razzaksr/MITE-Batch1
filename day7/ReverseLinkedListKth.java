package day7;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedListKth {
    public static LinkedList<Integer> reverseKth(LinkedList<Integer> src, int swap){
        for(int index = 0, count = 1;index<src.size();index++){
            if(count==swap){
                int start = index+1 - swap;// 3-3>> 
                int end = index;// 2
                while(start<end){
                    int currentValue = src.get(start);
                    int previousValue = src.get(end);
                    src.set(start, previousValue);
                    src.set(end, currentValue);
                    start++;end--;
                }
                count-=3;// 0
            }
            count++;// 1
        }
        return src;
    }
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        // System.out.println(myList);
        System.out.println(reverseKth(myList,3));
    }
}
