//Stack is a child class to vector class(legacy coLlection).It is introduced in jdk1.0 version.It follows all the be-
//haviour of vector class but it is able to manage all the elemnts as per lifo.


import java.util.Stack;

class Stack1 {
     public static void main(String[] args) {
         Stack s=new Stack();
         System.out.println(s.push(1));
         System.out.println(s.push(2));
         System.out.println(s.pop());
         System.out.println(s.search(1));
     }
}
