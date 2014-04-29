/*
Austin Kincaid
CS110
Assignment 10
*/

public class Card 
             implements Comparable<Card>{
   
   private int rank, suit, compared;
   private String ra, su, c;
   
   /**
    *Class constructor specifying the suit and rank of the card.
    *
    *@throws IndexOutOfBoundException if the entered values are not valid card values.
    */
   public Card(int s, int r){
      if(s < 1 || s > 4)
         throw new IndexOutOfBoundsException("Choose a suit between 1 and 4");
      else if (r < 1 || r > 13)
         throw new IndexOutOfBoundsException("Choose a rank between 1 and 13");
         
      rank = r;
      suit = s;
   }
   
   /**
    *gets the rank of the card.
    *
    *@return rank the rank of the card.
    */
   public int getRank(){
      return rank;
   }
   
   /**
    *gets the suit of the card.
    *
    *@return suit the suit of the card.
    */
   public int getSuit(){
      return suit;
   }
   
   /**
    *Compare's two card objects to each other.
    *<p>
    *Compare's the two cards using rank, subtracting the rank of the 
    *initialized Card object from the other Card object.
    *
    *@return compared the difference between the cards ranks.
    */
   public int compareTo(Card o){
      Card other = o;
      int thisRank = this.getRank();
      int otherRank = other.getRank();
      if (thisRank == 1)
         thisRank = 14;
      if (otherRank == 1)
         otherRank =14;
      compared = (thisRank - otherRank);
      return compared;
   }
   
    /**
    *Returns the face value of the card as a string.
    *
    *@return c the string value of the card.
    */
   public String toString(){
      if (rank == 1)
         ra = "Ace";
      else if (rank == 11)
         ra = "Jack";
      else if (rank == 12)
         ra = "Queen";
      else if (rank == 13)
         ra = "King";
      else
         ra = String.valueOf(rank);
      
      if (suit == 1)
         su = "Clubs";
      else if (suit == 2)
         su = "Diamonds";
      else if (suit == 3)
         su = "Hearts";
      else if (suit == 4)
         su = "Spades";
      
      c = "The card is the " + ra + " of " + su + ".";
      return c;
  
  
   }    

}