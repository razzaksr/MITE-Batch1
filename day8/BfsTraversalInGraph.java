package day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class BfsTraversalInGraph {
    public static void traverse(Map<Integer,List<Integer>> graph, int start){
        Queue<Integer> queue = new LinkedList<>();
        TreeSet<Integer> visited = new TreeSet<>();

        queue.offer(start);
        visited.add(start);

        while(!queue.isEmpty()){
            int polled = queue.poll();
            System.out.print(polled+" -> ");
            for(Integer each:graph.get(polled)){
                if(!visited.contains(each)){
                    visited.add(polled);
                    queue.offer(each);
                }
            }
        }
        System.out.println("reached");
    }
    public static void main(String[] args) {
        Map<Integer,List<Integer>> graph = new Hashtable<>();
        graph.put(1, Arrays.asList(2,3));
        graph.put(2, Arrays.asList(1,4));
        graph.put(3, Arrays.asList(1,5));
        graph.put(4, Arrays.asList(2));
        graph.put(5, Arrays.asList(3));

        traverse(graph,2);
    }
}
