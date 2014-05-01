/*
Austin Kincaid
CS110
Assignment 10
*/


public class GameOfWar{
   public static void main(String[] args){
   
   //wait for player initialization of game
   
   //deal two decks (use two queueReferenceBased)
   //create "in play" 'set'
   DeckOfCards d1 = new DeckOfCards();
   d1.shuffle();
   QueueReferenceBased player1 = new QueueReferenceBased();
   QueueReferenceBased computer = new QueueReferenceBased();
   String winner = "empty";
   int rounds = 0;
   for(int p1 = 0; p1 < 26; p1++){
      player1.enqueue(d1.deal(p1));
   }   
   for(int comp = 26; comp<52;comp++){
      computer.enqueue(d1.deal(comp));
   }
   //wait for player to start round
   
   //put cards into play and add to "in play"
   while (winner.equals("empty")){
   Card pCard = player1.dequeue();
   Card cCard = computer.dequeue();
   rounds ++;
   
   if (pCard.compareTo(cCard) > 0){
      System.out.println("you win the round!");
      player1.enqueue(pCard);
      player1.enqueue(cCard);
   }
   else if (pCard.compareTo(cCard) < 0){
      System.out.println("the computer wins the round.");
      computer.enqueue(pCard);
      computer.enqueue(cCard);
   }
   
   else if (pCard.compareTo(cCard) = 0){
      System.out.println("WAR!");
      Card pWar1Card = player1.dequeue();
      Card pWar2Card = player1.dequeue();
      Card cWar1Card = computer.dequeue();
      Card cWar2Card = computer.dequeue();
         if (pWar1Card.compareTo(cWar1Card) > 0){
            System.out.println("you win the war!");
            player1.enqueue(pCard);
            player1.enqueue(cCard);
            player1.enqueue(pWar1Card);
            player1.enqueue(pWar2Card);
            player1.enqueue(cWar1Card);
            player1.enqueue(cWar2Card);
         }
         else if (pWar1Card.compareTo(cWar1Card) < 0){
            System.out.println("the computer wins the war.");
            computer.enqueue(pCard);
            computer.enqueue(cCard);
            computer.enqueue(pWar1Card);
            computer.enqueue(pWar2Card);
            computer.enqueue(cWar1Card);
            computer.enqueue(cWar2Card);
         }
            
         

               
   }            
   //wait for user imput to start again
  
   
   
   
   }
  // public String getWinner(){
    //  return winner;
  //}
}
}