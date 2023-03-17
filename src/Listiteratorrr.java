import java.util.ArrayList;
import java.util.ListIterator;

class Listiteratorrr {
     public static void main(String[] args) {
         ArrayList<Integer>al=new ArrayList();
         al.add(1);
         al.add(2);
         al.add(3);
         ListIterator<Integer> li=al.listIterator();
         while(li.hasNext()){
             System.out.println(li.nextIndex()+"-->"+li.next());
         }
         ListIterator<Integer> pi=al.listIterator();
         while(pi.hasPrevious()){
             System.out.println(pi.previousIndex()+"-->"+pi.previous());
         }


     }
}
