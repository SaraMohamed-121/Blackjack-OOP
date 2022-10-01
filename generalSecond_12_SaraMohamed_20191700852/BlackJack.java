package blackjack;

import java.util.*;

public class BlackJack {
    static Game G1=new Game();
    
    public static void main(String[] args) {
        
        GUI gui = new GUI();
        G1.generates_the_card();
        G1.Set_player_info();
        G1.draws_randomly();
        
        
        gui.runGUI( G1.cards,G1.players[0].getHand_card(),G1.players[1].getHand_card() ,
        G1.players[2].getHand_card() ,G1.players[3].getHand_card() );
        
       
        players_choise(gui);
        dealer_choise(gui);
        winner();
    }
    
    
    //Starts the game with player(0-2)
    public static void players_choise(GUI gui){
        Scanner in=new Scanner(System.in);
        int choise=0;
        for(int n=0;n<=2;n++){
           // G1.players[n]=new Player();
            int count=2;
            System.out.println("******************************");
            System.out.printf("%d)'s turn \n",(n+1));
            do{
               System.out.printf("Please enter your choice:(1 or 2) : your hand %d card  \n1.Hit \n2.Stand\n",(count));
               choise=in.nextInt();
               if((choise==2)){
                   break;
               }else if((choise==1)){
                  System.out.println("The dealer gives the player a card....");
                  Card card=new Card(G1.draws_randomly());
                  G1.players[n].AddCard(card);
                  gui.updatePlayerHand(card,n);
                  G1.update_maximum_score();
                  
                  if(count==11){
                   break;
                  }else if(G1.players[n].Score>21){
                     System.out.printf("Player %d BUSTED  \n",(n+1));
                     break;
                  }else if(G1.players[n].Score==21){
                     System.out.printf("Player %d BLACKJACK  \n",(n+1));
                     break;
                  }
                  count++;
               }
            }while(true);
            
        }   
           
    }
    //dealer’s turn starts
    public static void dealer_choise(GUI gui){
            System.out.println("***********************************");
            System.out.println("dealer)'s turn \n");
            while(G1.players[3].Score<=G1.high_score){
               if(G1.players[3].Score==21){ 
                 System.out.println("dealer BLACKJACK ");
                 break;
               }else if(G1.players[3].Score<21){
                   Card card=new Card(G1.draws_randomly());
                   G1.players[3].AddCard(card);
                   gui.updateDealerHand(card,G1.cards);
                   G1.update_maximum_score();
                   if(G1.players[3].Score>21){
                      System.out.println("dealer BUSTED ");
                   }
               }
            }
            
    }
    //show from player won the game or it’s a PUSH
    public static void winner(){
        int winner=-1;
        int count_win=0;
        for(int n=0;n<=3;n++){
            if(G1.high_score==G1.players[n].Score){
                winner=n;
                count_win++;
            }
        }
        if(count_win==1){
           System.out.printf("%d is %s ,win with score %d\n ",winner+1,G1.players[winner].Name,G1.high_score);
        }else if(count_win>1){
           System.out.printf("push \n ");
        }
         
    }
    
    
}
