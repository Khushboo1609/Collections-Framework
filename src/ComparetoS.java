 class ComparetoS {
     public static void main(String[] args) {
         String s=new String("aaaa");
         String s1=new String("ebbbb");
         System.out.println(s.compareTo(s1));//-4
         System.out.println(s1.compareTo(s));//4
         System.out.println(s.compareTo(s));//0
     }
}
