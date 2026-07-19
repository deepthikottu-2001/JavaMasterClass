package course.collectionpkg;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args){
        //Queue<String> queue = new LinkedList<>(); --> for Linked List
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Grape");
        queue.poll();
       for(String fruit : queue){
           System.out.println(fruit);
       }

    }

}
