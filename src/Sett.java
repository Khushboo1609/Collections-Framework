import java.util.HashSet;

//it is a child interface to collection interface & it does not manage element based on indexing but manage them based
// on the basis of hashcode value,it does not allow duplicate value.....set have implementation in the form of hashset,
//navigable hashset,tree set & LinkedHashset........Hashset is not synchronized.
 class Sett {
 public static void main(String[] args) {
  HashSet<String>hs=new HashSet();
  hs.add("aaaa");

  hs.add("bbbb");
  hs.add("cccc");
  hs.add("dddd");
  hs.add("eeeee");
  System.out.println(hs);//o/p:[eeeee, aaaa, bbbb, cccc, dddd] it doenot follow insertion order and sorted order
  //System.out.println(hs.get(1)); it does not follow indexing unless it shgould work
 }
}
