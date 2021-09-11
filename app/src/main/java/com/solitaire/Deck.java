package com.solitaire;

import java.util.Random;

public class Deck {

    public static final String SUITS = "SDCH";
    public static final String RANKS = "A234567890JQK";
    public static final int SIZE = 52;

    private Card[] deck;

    /**
     * Constructor for Deck object; Initializes Cards in new deck order (A -> K; S -> D -> C -> H)
     */
    public Deck(){
        this.deck = new Card[SIZE];

        int count = 0;
        Card c;
        for(int s = 0; s < SUITS.length(); s++){
            for(int r = 0; r < RANKS.length(); r++){
               c = new Card(SUITS.charAt(s), RANKS.charAt(r));
               deck[count++] = c;
            }
        }
    }

    /**
     * Shuffles the deck
     */
    public void shuffle(){
        int index;
        Random rand = new Random();

        for(int i = 0; i < SIZE; i++){
            index = i + rand.nextInt(SIZE - i);
            if(index != i){
                Card temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
        }
    }

    /**
     * Prints the deck to standard output;
     * Only for testing
     */
    public void display(){
        for(int i = 0; i < SIZE; i++){
            System.out.print(this.deck[i].getRank() + "" + deck[i].getSuit() + " ");
            if( (i+1) % 13 == 0){
                System.out.println();
            }
        }
    }

}
