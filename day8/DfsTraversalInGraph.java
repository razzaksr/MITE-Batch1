package day8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DfsTraversalInGraph {

    public static void traverse(Map<Integer,List<Integer>> graph,int begin,Set<Integer> visited){
        if(visited.contains(begin))
            return;
        visited.add(begin);
        System.out.print(begin+" -> ");
        for(int each:graph.get(begin)){
            traverse(graph, each, visited);
        }
    }

    public static void main(String[] args) {
        Map<Integer,List<Integer>> graph = new Hashtable<>();
        graph.put(1, Arrays.asList(2,3));
        graph.put(2, Arrays.asList(1,4));
        graph.put(3, Arrays.asList(1,5));
        graph.put(4, Arrays.asList(2));
        graph.put(5, Arrays.asList(3));

        traverse(graph,4,new HashSet<>());
        System.out.println("reached");
    }
}
