//Tree Set is  implemented on balancedTree.It is asynchronous.It sorts the element on the basis of compareTo() method
// present in comparable interface .

import java.util.TreeSet;

class TreeSett {
     public static void main(String[] args) {
         TreeSet<String> t=new TreeSet<>();
         t.add("aaaa");
         t.add("bbbb");
         t.add("cccc");
         t.add("dddd");
         System.out.println(t);
         //t.add((new StringBuffer("ssss")));---->String buffer  do not implement comparable
        //t.add(5);can not add heterogenous element
         t.add(null);//null pointer exception
     }
}
