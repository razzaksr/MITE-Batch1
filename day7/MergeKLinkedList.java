package day7;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class MergeKLinkedList {

    public static LinkedList<Integer> merge(List[] src){
        LinkedList<Integer> finalList = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(List each:src){
            priorityQueue.addAll(each);
        }

        while(!priorityQueue.isEmpty()){
            finalList.add(priorityQueue.poll());
        }

        return finalList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Stream.of(1,4,5).toList();
        List<Integer> list2 = Stream.of(1,3,4).toList();
        List<Integer> list3 = Stream.of(2,6).toList();

        List[] source = {list1,list2,list3};

        System.out.println(merge(source));

    }
}
