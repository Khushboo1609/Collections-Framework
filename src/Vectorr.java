import java.util.Vector;

//Vector is a direct implementation class to list interface,list interface is a child interface so,vector has to pr-
//ovide implementation to all methods of list interface and collection interface(legacy collection).it is synchronized.
//it does not allow more than one thread at a time to access data (thread safe)
class Vectorr {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement(1);//add element method is specific to vectors
        v.addElement("java");
        v.addElement("great");
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.elementAt(1));
        System.out.println(v.removeElement(1));
        System.out.println(v);


    }
}
