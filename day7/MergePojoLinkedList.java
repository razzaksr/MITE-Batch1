package day7;

import java.util.PriorityQueue;

public class MergePojoLinkedList {
    public static MyPack mergeEverythingTogether(MyPack[] arr){
        MyPack head = new MyPack(0);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(MyPack each:arr){
            while(each!=null){
                queue.add(each.price);
                each=each.next;
            }
        }

        MyPack traversal = head;

        while(!queue.isEmpty()){
            MyPack temp = new MyPack(queue.poll());
            traversal.next = temp;
            traversal = temp;
        }

        return head.next;
    }
    public static void main(String[] args) {
        MyPack myPack1 = new MyPack(1);
        myPack1.next = new MyPack(4);
        myPack1.next.next = new MyPack(5);
        MyPack myPack2 = new MyPack(1);
        myPack2.next = new MyPack(3);
        myPack2.next.next = new MyPack(4);
        MyPack myPack3 = new MyPack(2);
        myPack3.next = new MyPack(6);

        MyPack[] source = {myPack1,myPack2,myPack3};

        MyPack received = mergeEverythingTogether(source);

        // next pointer
        while(received!=null){
            System.out.print(received.price+" -> ");
            received = received.next;
        }
        System.out.println("null");
    }
}

class MyPack{
    int price;
    MyPack next;
    public MyPack(){}
    public MyPack(int value){price=value;next=null;}
}
