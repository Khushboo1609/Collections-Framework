//priority queue is direct implementation to queue.if some os is not supported priority it will produce its own sorting
//order.it does not allow null value addition.it allow addition of duplicate element.it is asynchronous.if one is adding
//non comparable values  then one has to implement comparator interface.

import java.util.PriorityQueue;

class Priority {
     public static void main(String[] args) {
         PriorityQueue<StringBuffer> pq=new PriorityQueue<>();
         pq.add(new StringBuffer("abc"));
         System.out.println(pq.remove());
     }
}
