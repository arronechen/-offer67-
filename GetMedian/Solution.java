package Niuke.GetMedian;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    /**
     *
     */
    int count = 0;
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>( new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });

    public void Insert(Integer num) {
        count++;
        if (count%2!=0){
            minheap.offer(num);
            int number = minheap.poll();
            maxheap.offer(number);
        }else {
            maxheap.offer(num);
            int number = maxheap.poll();
            minheap.offer(number);
        }


    }

    public Double GetMedian() {
        if (count%2!=0){
            return (double)maxheap.peek();
        }else{
            return (double)(maxheap.peek()+minheap.peek())/2;
        }

    }
}
