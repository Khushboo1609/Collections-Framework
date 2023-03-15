//list is a child interface to collection interface .As it is the child interface it can use all the methods of collect
//ion interface ....it has 3 implementation classes (ArrayList,Vector & LinkList)
import java.util.ArrayList;
import java.util.List;

class List1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add(0,"khushboo");
        list.add(1,"khushboo");
        list.add(1,"Bansal");
        System.out.println(list);
        //list.add(5,"khushboo"); give exception
        List<String> list1=new ArrayList();
        list1.add(0,"Muskan");
        list1.add(1,"Bansal");
        list1.addAll(1,list);
        System.out.println(list1);
    }
}
