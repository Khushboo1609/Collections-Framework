//map is not the child interface to collection it is one of the root interface.it represents  all the  elements in the
//form of key value pair.Example:telephone directory.in map both key and value are object they are not allowing primitive
// data type.in key value pair key must be unique but values can be duplicated.in mao by default both insertion order &
//sorting order is not followed.Hashmap do not follow both.LinkedHashmap follows insertion order.sorted map,navigable
//map and sorted map follows sorting order.map allows heterogenous order.sorted map,navigable
////map and sorted map allows homogenous element only.In maps  keys allow one null element but values can allow more
//than one null element.sorted map,navigable map treemap do not allow even single null elements .

import java.util.HashMap;

class Map {
    public static void main(String[] args) {
        java.util.Map<String,String> map=new HashMap<>();
        map.put("A","AaA");
        map.put("B","BaB");
        System.out.println(map);
        map.put("B","Ba");
        System.out.println(map.keySet());//[A, B]
        System.out.println(map.values());//[AaA, Ba]

        System.out.println(map);
        java.util.Map<String,String> map1=new HashMap<>();
        map1.put("D","EeE");
        map1.putAll(map);
        System.out.println(map1);
        System.out.println(map.get("B"));
        System.out.println(map.remove("B"));//if value does not exist &  we are trying to perform remove operation
                                             // then null  value  will come aas output.
        System.out.println(map.containsKey("A"));
        System.out.println(map.size());
       map.clear();
        System.out.println(map.size());//to remove all the key value pair
        System.out.println(map.isEmpty());//if map is empty then is empty method will return true value  unless it will
        //return false value
        System.out.println(map.containsValue("AaA"));

    }
}
