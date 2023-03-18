import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Entry is the inner interface of the map interface.
 class Entryy {
 public static void main(String[] args) {
  Map<String, String> map=new HashMap<>();
  map.put("A","aaa");
  map.put("B","bbb");
  System.out.println(map);
  Set<Map.Entry<String,String>> set=map.entrySet();
  Iterator<Map.Entry<String,String>>it=set.iterator();
  while(it.hasNext())
  {
   Map.Entry<String,String>entry=it.next();
   System.out.println(entry.getKey()+"----->"+entry.getKey());
  }

 }
}
