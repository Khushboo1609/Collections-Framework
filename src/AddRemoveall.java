//collection is root  interface in collections.There exists mainly 2 types of root interfaces in collections(collection,
//Map)

import java.util.ArrayList;
import java.util.HashSet;

class AddRemoveall {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(3);
        hs1.add(2);
        hs1.addAll(hs);
        System.out.println(hs1);//hs1 contains element of hs and hs1 both (duplicates alsoo removed)
        ArrayList<String> al=new ArrayList<String>();
        al.add("khushboo");
        al.add("Bansal");
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("khushboo");
        al1.add("Bansal");
        al1.add("muskan");
        al1.removeAll(al);
        System.out.println(al1);//all the elments of al is removed from al1
        System.out.println(al.contains("khushboo"));//as all contains the particular element it will return true....
        System.out.println(al.containsAll(al1));// al donot contains all the elements of al1


    }
}
