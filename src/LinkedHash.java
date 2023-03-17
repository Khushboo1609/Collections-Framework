import java.util.LinkedHashSet;
//LinkedHashset is  the child class of hashset.its internal data structure is Hashtable+linked list unlike HashSet whose
//internal data structure is hashtable only.LinkedHashset follows insertion order while Hashset does not.
class LinkedHash {
     public static void main(String[] args) {
         LinkedHashSet<String> lh=new LinkedHashSet<>();
         lh.add("aaa");
         lh.add("bbb");
         lh.add("eee");
         lh.add("ccc");
         lh.add("ddd");
         System.out.println(lh);//follows insertion order

     }
}
