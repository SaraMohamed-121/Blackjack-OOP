package blackjack;

public class Player {
    public String Name;
    public int Score=0;
    private int counter=0;
    boolean win=false; 
    private Card[] hand_card=new Card[11];

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getScore() {
        return Score;
    }
    public void setScore(int Score) {
        this.Score = Score;
    }
    public Card[] getHand_card() {
        return hand_card;
    }
    public void setHand_card(Card[] hand_card) {
        this.hand_card = hand_card;
    }
    public int getCounter() {
        return counter;
    }

   
  
    //add card +score got a blackjack or not , already lost or not
    public boolean AddCard(Card card){
        //counter=0;
        //Score=0;
        if(counter<11){
            hand_card[counter]=new Card(card);
            counter++;
            Score+=card.getValue();
        }
        if(Score>21){
            win=false;
        }else if(Score==21){
            win=true;
        }
       return win;
    }
        
}
