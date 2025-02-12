package day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPairSumViaHT {

    public static List<Integer> findTwoPair(int[] arr, int target){
        List<Integer> pairs = new ArrayList<>();// factory

        Map<Integer, Integer> myTable = new HashMap<>();// factory
        for(int index = 0; index< arr.length;index++){
            int key = target - arr[index];
            if(myTable.getOrDefault(key,0)>0){
                pairs.add(key);
                pairs.add(arr[index]);
                break;
            }
            myTable.put(arr[index], myTable.getOrDefault(arr[index],0)+1);
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] transactions = {800,1200,4500,320,600,800,560,4500,12000,320};
        // int target = 100;
        // int target = 1400;
        int target = 2000;
        System.out.println(findTwoPair(transactions, target));
    }
}
