import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

//Dq is double ended queue.queue is able to allow  addition  of element from tail side and removal from head side .but
// deque  is able to allow all these operations from both the ends .It is a child interface to queue interface .there
//exist 2 types of queue's in java bounded and unbounded.in case of bounded queue if one is adding the elements beyond
// its  maximum capacity using  add first method it will raise an exception but if we  add using offer first method
// no exception will rise.
 class Dq {
    public static void main(String[] args) {
        Deque<Integer>  dq=new LinkedList<>();
        dq.addFirst(4);//add element as first element in head side
        dq.addFirst(5);
        System.out.println(dq);//o/p:5,4
        dq.addLast(8);


        dq.addLast(9);
        System.out.println(dq);//add element in dq from tail side  [5, 4, 8, 9]
        System.out.println(dq.removeFirst());
        System.out.println(dq);//[4, 8, 9]
        System.out.println(dq.removeLast());//9
        System.out.println(dq);//[4, 8]
        System.out.println(dq.getFirst());//4
        System.out.println(dq.getLast());//8
        System.out.println(dq.removeFirstOccurrence(4));//true
        System.out.println(dq);//8
        Iterator<Integer> it= dq.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}

