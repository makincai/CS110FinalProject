public class CardTester{

   public static void main(String [] args){
   Card c1 = new Card(5,1);
   Card c2 = new Card(1,3);
   Card c3 = new Card(4,11);
   System.out.println(c1.toString());
   System.out.println(c2.toString());
   System.out.println(c3.toString());
   System.out.println(c3.compareTo(c1));
   }
}