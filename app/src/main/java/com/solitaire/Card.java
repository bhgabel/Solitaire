package com.solitaire;

public class Card {

    // List of card's variables
    private final char suit;
    private final char rank;

    public Card(char suit, char rank){
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Checks if the card object is a black suit
     * @return true if suit is Spades or Clubs; false if suit is Hearts or Diamonds
     */
    public boolean isBlack(){
        char suit = this.getSuit();

        if(suit == 'S' || suit == 'C'){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return suit of the card object as a char
     */
    public char getSuit(){
        return this.suit;
    }

    /**
     * @return rank of the card object as a char
     */
    public char getRank(){
        return this.rank;
    }

    /**
     * @return suit of the card object as a full string, ie Spades
     */
    public String getFullSuit(){
        String s = "";
        switch (this.suit){
            case 'S': s = "Spades";
                break;
            case 'D': s = "Diamonds";
                break;
            case 'C': s = "Clubs";
                break;
            case 'H': s = "Hearts";
                break;
        }

        return s;
    }

    /**
     * @return rank of the card object as a full string, ie Ace
     */
    public String getFullRank(){
        String r = "";
        switch(this.rank){
            case 'A': r = "Ace";
                break;
            case '1': r = "1";
                break;
            case '2': r = "2";
                break;
            case '3': r = "3";
                break;
            case '4': r = "4";
                break;
            case '5': r = "5";
                break;
            case '6': r = "6";
                break;
            case '7': r = "7";
                break;
            case '8': r = "8";
                break;
            case '9': r = "9";
                break;
            case '0': r = "10";
                break;
            case 'J': r = "Jack";
                break;
            case 'Q': r = "Queen";
                break;
            case 'K': r = "King";
                break;
        }

        return r;
    }

}
