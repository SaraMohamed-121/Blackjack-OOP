package blackjack;

public class Card {
   private final int suit;
   private final int rank;
   private final int value;

   //Getters 
    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
 
   //Parameterized constructor that sets all the attributes
   public Card(int suit,int rank,int value){
      this.suit=suit;
      this.rank=rank;
      this.value=value;
   }
   //Copy constructor
   public Card(Card cards){
      this.suit=cards.suit;
      this.rank=cards.rank;
      this.value=cards.value;
   }
 
    
    // static String[] suits={"Clubs","Diamonds","Hearts","Spades"};
    // static String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
}
