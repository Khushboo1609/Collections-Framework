//hashmap is direct implementation class to map interface.it allows all the elements in key value pair.in key value pair
//key must be unique values can be duplicate .both key and values allow heterogenous element.it is not following sorting
 // & insertion order.key are able to allow one null element but values can allow any number of null elements.hashmap
//internal data structure is hashtable.its default capacity is 16 element and load factor is 0.75.no method is synchro
// nised  in hashmap.

import java.util.HashMap;

class Hashmap {
     public static void main(String[] args) {
         HashMap map=new HashMap();
         map.put("a","aaa");
         map.put("b","bbb");
         map.put("a","bbb");
         System.out.println(map);//keyside duplicate are not allowed but value  side  it is allowed.
         map.put(1,2);//heterogenous  elements addition is allowed
         System.out.println(map);
         map.put(null,1);
         map.put(null,2);
         System.out.println(map);//only one null is allowed in key set
         map.put(1,null);
         map.put(2,null);
         System.out.println(map);//more than one null can be allowed in value set
     }
}
