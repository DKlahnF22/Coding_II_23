package Arcade_Project;

public class Card {
    //fields
    private int credBalance;
    private int tikBal;
    private int cardIndent;

    //constructor
    public Card(int credBalance, int tikBal, int cardIndent){
        this.credBalance = credBalance;
        this.tikBal = tikBal;
        this.cardIndent = cardIndent;
       }

    //getters

    public int getCredBalance(){
        return credBalance;
    }

    public int getTikBal(){
        return tikBal;
    }

    public int getCardIndent(){
        return cardIndent;
    }
}
