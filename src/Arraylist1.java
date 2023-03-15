//Arraylist is the implementation class for both the collection and list interface.Al has all the characteristic of List
//it is not thread safe .Arraylist allow heterogeneous element addition (one can add both string ,integer or any other).
//ArrayList is non-synchronous collection.It is preferred where we require frequent retrieval operations

import java.util.ArrayList;

class Arraylist1 {
 public static void main(String[] args) {
  ArrayList al =new ArrayList();
  al.add(1);
  al.add(null);
  al.add("khushboo");
  System.out.println(al.get(0));
  System.out.println(al.get(1));
  System.out.println(al.get(2));


 }

}
