import java.util.LinkedList;

//it is the direct implementation class for list and collection interface .It is able to arrange all the data as per
//indexing.it is suggestible where frequent insertion and deletion operation are required.It has double linkedList as
//its internal data structure.It is not synchronized.Queue implementation is also provided with in LinkedList.
 class LinkL {
 public static void main(String[] args) {
  LinkedList l=new LinkedList();
  l.add(1);
  l.addFirst(3);
  l.addLast(2);
  l.removeLast();
  l.removeFirst();
  System.out.println(l.get(0));

 }
}
