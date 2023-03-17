//SortedHashSet is the child interface to set interface.it follows sorted order that is why it does not allow hetero g-
// nous elements .to maintain the sorted order Sorted Hashset internally  call compare to method .It does not allow even
//single null element.

import java.util.SortedSet;
import java.util.TreeSet;

class SortedHs {
    public static void main(String[] args) {
        SortedSet<String> ss=new TreeSet<String>() ;
        ss.add("aaa");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet("ccc"));//o/p:[aaa, bbb]
        System.out.println(ss.tailSet("ccc"));//o/p:[ccc, ddd]
        System.out.println(ss.subSet("aaa","ccc"));//o/p:[aaa, bbb]


    }


}
