package com.solitaire;

import java.util.ArrayList;
import java.util.Stack;

public class GameField {
    public static final int NUM_OF_ACES = 4;
    public static final int NUM_OF_COLS = 7;

    private ArrayList<Stack<Card>> aces = new ArrayList<>(NUM_OF_ACES);

    private ArrayList<ArrayList<Card>> columns = new ArrayList<>(NUM_OF_COLS);

    private ArrayList<Card> wastePile;

    public GameField(){

        //Create new deck and shuffle
        Deck deck = new Deck();
        deck.shuffle();

        //Initialize the stacks for ace piles
        for(int i = 0; i < NUM_OF_ACES; i++){
            this.aces.add(i, new Stack<Card>());
        }

        //Initialize columns in play field
        for(int i = 0; i < NUM_OF_COLS; i++){
            this.columns.add(i, new ArrayList<Card>());
        }

        //Add Cards to each column - ie the deal
        int deckIdx = 0;
        for (int i = 0; i < NUM_OF_COLS; i++) {
            for (int idx = 0; i+idx < NUM_OF_COLS; idx++) {
                ArrayList<Card> col = this.columns.get(i+idx);
                col.add(deck.get(deckIdx));
            }
        }

        wastePile = new ArrayList<Card>();

    }

    //TODO determine best logic to find valid move
    public boolean checkValidMove(Card c){
        boolean valid = false;

        for(int i = 0; i < NUM_OF_ACES; i++){
            if(this.aces.get(i).empty()){
                valid = c.isAce();
            }
            else{
                valid = c.oneGreaterRank(this.aces.get(i).peek());
            }
        }

        return valid;
    }


}
