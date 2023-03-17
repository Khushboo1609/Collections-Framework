//Iterator iss universal cursor applicable  for all time of collection like arraylist,sets,priority queue.Unlike this Enumeration is
//applicable only for legacy collections..........

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Iteratorrr {
     public static void main(String[] args) {
         List<String > l=new ArrayList();
         l.add("aaa");
         l.add("bbb");
         l.add("ccc");
         Iterator it=l.iterator();
         while(it.hasNext())
         {
             String element= (String) it.next();
             if(element.equals("bbb"))
                 it.remove();
             System.out.println(l);
         }
     }
}
