// Queue is a child interface to collection interface and have many implementation classes.it follows fifo approach so
//element addition took place from tail and removal took place from head always .


import java.util.PriorityQueue;
import java.util.Queue;

class Q {
     public static void main(String[] args) {
         Queue<Integer> que=new PriorityQueue<>();
         System.out.println(que.poll());//null value as output
         System.out.println(que.remove());//exception raise:no such element exception
         System.out.println(que.peek());//null value as output
         System.out.println(que.element());//exception raise:no such element exception
     }
}
