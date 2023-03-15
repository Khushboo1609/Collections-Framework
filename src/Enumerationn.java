 // A Java Cursor is an Iterator, which is used to iterate or traverse or retrieve a Collection or Stream object’s
 // elements one by one. There are three cursors in Java.
 //
 //Iterator
 //Enumeration
 //ListIterator
 //Enumeration is an interface provided by java.when we create  enumeration object automatically all the elements of the
 //vector will bs copier to enumeration object.It provides only read operation while iterating the elements & it does
 //not allow remove ,replace and insert operation ...

 import java.util.Enumeration;
 import java.util.Vector;

 class Enumerationn {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
