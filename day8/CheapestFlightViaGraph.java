package day8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class CheapestFlightViaGraph {
    public static int minCostSrcToDest(int[][] arr, int src, int dest, int between){
        // create table to represent graph
        Map<Integer,List<int[]>> graph= new Hashtable<>();
        for(int[] each:arr){
            graph.computeIfAbsent(each[0], key->new ArrayList<>()).add(new int[]{each[1],each[2]});
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        queue.offer(new int[]{0,src,0});
        Map<Integer,Integer> minCost = new TreeMap<>();

        while(!queue.isEmpty()){
            int[] received = queue.poll();
            int cost = received[0], port = received[1], rest = received[2];

            if(port==dest)return cost;
            if(rest>between)continue;
            if(!graph.containsKey(port))continue;

            for(int[] next:graph.get(port)){
                int newPort = next[0], price = next[1];
                int newCost = cost+price;
                if(!minCost.containsKey(newPort)||minCost.get(newPort)>newCost){
                    minCost.put(newPort,newCost);
                    queue.offer(new int[]{newCost,newPort,rest+1});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] plans = {
            {0,1,100},
            {1,2,100},
            {2,0,100},
            {1,3,600},
            {2,3,200}
        };
        int restPort = 1;
        System.out.println(minCostSrcToDest(plans, 1, 0, restPort));
    }
}
