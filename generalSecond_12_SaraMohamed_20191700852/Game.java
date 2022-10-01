package blackjack;
import java.util.*;
//scanner , random


public class Game {
    //{"P1","P2","p3","D"};
    public Player players[]=new Player[4];
    public Card cards[]=new Card[52];
   // public int high_score[]=new int[4];
    public int high_score=0;
    
    public void setPlayers(Player[] players) {
        this.players = players;
    }
     public Player[] getPlayers() {
        return players;
    }
    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public Card[] getCards() {
        return cards;
    }
   
  
    //function generates the card deck array
    public void generates_the_card() {
        int index=0;
        for(int suit=0;suit<=3;suit++){
            for(int rank=0;rank<=12;rank++){
                int value;
                if(rank>=10){
                    value=10;
                }else{
                    value=rank+1;
                }
               //Card card=new Card(suit,rank,value);
               cards[index]=new Card(suit,rank,value);
                      // card;
               index++;
            }
        }   
    }
        
    //function draws a card randomly //return Card
    public Card draws_randomly(){
        Random rand=new Random();
        Card card;//=null;
        
        while(true){
           int randomchoise=rand.nextInt(52); 
           //(0-51)
           if(cards[randomchoise]!=null){
           card=new Card(cards[randomchoise]); 
           cards[randomchoise]=null;
           return card;
           }
        }//while(card==null);  
           
    }       
         
    //function that sets the information of the players
    public void Set_player_info(){
        Scanner input=new Scanner(System.in);
        //Array of 3 players
        for(int n=0;n<=2;n++){
            players[n]=new Player();
            
           //for each players [0-2] name
           System.out.printf("Enter player %d name : ",(n+1));
           players[n].Name=input.next();
           //for each players[0-2] select 2 card
           players[n].AddCard(this.draws_randomly());
           players[n].AddCard(this.draws_randomly());
          // update_maximum_score();
           
        }
           players[3]=new Player();
           //dealer array at index [3] dealer
           players[3].Name="dealer";
           //select 2 card
           players[3].AddCard(this.draws_randomly());
           players[3].AddCard(this.draws_randomly());
           //update_maximum_score();
        
    }
    
    //function update the game maximum score of all players
    public void update_maximum_score(){
       
       for(int n=0;n<=3;n++){
            if(players[n].Score>high_score && players[n].Score<=21){
                high_score=players[n].Score;
            }
        }
    }
 
    
    
    
    
    
    //constructor
  /*
       for(int m=0;m<3;m++){
          if(players[m].Score<=21){ 
          high_score[m]=players[m].Score;
          }else{
          high_score[m]=0;
          } 
       }*/
}
