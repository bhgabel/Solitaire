package com.solitaire;

public class Card {

    // List of Card object variables
    private final char suit;
    private final char rank;
    protected boolean visible;

    public Card(char suit, char rank){
        this.suit = suit;
        this.rank = rank;
        this.visible = false;
    }

    /**
     * Checks if the card object is a black suit
     * @return true if suit is Spades or Clubs; false if suit is Hearts or Diamonds
     */
    public boolean isBlack(){
        char suit = this.getSuit();

        return suit == 'S' || suit == 'C';
    }

    /**
     * Checks if current Card precedes Card c sequentially
     * @param c Card to compare to
     * @return true if current Card rank is one less than param, ie Q < K
     */
    public boolean oneLessRank(Card c){
        int idx1 = Deck.RANKS.indexOf(this.getRank());
        int idx2 = Deck.RANKS.indexOf(c.getRank());

        return (idx1 + 1) == idx2;
    }

    /**
     * Checks if current Card follows Card c sequentially
     * @param c Card to compare to
     * @return true if current Card rank is one less than param, ie 7 > 6
     */
    public boolean oneGreaterRank(Card c){
        int idx1 = Deck.RANKS.indexOf(this.getRank());
        int idx2 = Deck.RANKS.indexOf(c.getRank());

        return (idx1 - 1) == idx2;
    }

    /**
     * Checks if current Card is of opposite suit color and exactly one less rank than comparison
     * @param c Card to compare to
     * @return true if current Card and param are opposite colors and one less rank, ie 4S < 5H
     */
    public boolean validMove(Card c){
        boolean oppositeColors = this.isBlack() && ! (c.isBlack());
        return oppositeColors && this.oneLessRank(c);
    }

    /**
     * Checks if current card can be played on an ace pile
     * @param c top Card in ace pile
     * @return true if current Card is next sequential card of same suit
     */
    public boolean validMoveAce(Card c){
        boolean sameSuit = this.getSuit() == c.getSuit();
        return sameSuit && this.oneGreaterRank(c);
    }

    /**
     * Changes a Card to be visible
     */
    public void makeVisible(){
        this.visible = true;
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

    public boolean isVisible(){
        return this.visible;
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
