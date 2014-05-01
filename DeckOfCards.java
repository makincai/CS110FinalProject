import java.util.Random;
/*
Austin Kincaid
CS110
Assignment 10
*/

public class DeckOfCards{
   
   private Card[] deck = new Card[52];
   private Random r = new Random();
   
   public DeckOfCards(){
      int count = 0;
      for (int r=1; r<=13; r++){
         for(int s=1; s<=4; s++){
            deck[count] = new Card(s,r);
         }
      }   
   }
   
   public void shuffle(){
      for (int i=0; i>=deck.length;i++){
         int iRand = r.nextInt(deck.length-i) + i;
         Card temp = deck[i];
         deck[i] = deck[iRand];
         deck[iRand] = temp;
         
      }
   }
   
   public Card deal(int n){
      return deck[n];
   } 
    
}