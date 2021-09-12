package com.solitaire;

import java.util.Stack;
import java.util.Vector;

public class GameField {
    //TODO look up best data type for these variables
    private Stack<Card>[] aces = new Stack[4];
    protected Stack<Card> ace0;
    protected Stack<Card> ace1;
    protected Stack<Card> ace2;
    protected Stack<Card> ace3;

    protected Vector<Card> col1 = new Vector<>();
    protected Vector<Card> col2 = new Vector<>();
    protected Vector<Card> col3 = new Vector<>();
    protected Vector<Card> col4 = new Vector<>();
    protected Vector<Card> col5 = new Vector<>();
    protected Vector<Card> col6 = new Vector<>();
    protected Vector<Card> col7 = new Vector<>();

    protected Vector<Card> wastePile;

    public GameField(){

        Deck deck = new Deck();
        deck.shuffle();

        ace0 = new Stack<>();
        aces[0] = ace0;
        ace1 = new Stack<>();
        aces[1] = ace1;
        ace2 = new Stack<>();
        aces[2] = ace2;
        ace3 = new Stack<>();
        aces[3] = ace3;

        col1.add(deck[0]);

        col2.add(deck[1]);
        col2.add(deck[7]);

        col3.add(deck[2]);
        col3.add(deck[8]);
        col3.add(deck[13]);

        col4.add(deck[3]);
        col4.add(deck[9]);
        col4.add(deck[14]);
        col4.add(deck[18]);

        col5.add(deck[4]);
        col5.add(deck[10]);
        col5.add(deck[15]);
        col5.add(deck[19]);
        col5.add(deck[22]);

        col6.add(deck[5]);
        col6.add(deck[11]);
        col6.add(deck[16]);
        col6.add(deck[20]);
        col6.add(deck[23]);
        col6.add(deck[25]);

        col7.add(deck[6]);
        col7.add(deck[12]);
        col7.add(deck[17]);
        col7.add(deck[21]);
        col7.add(deck[24]);
        col7.add(deck[26]);
        col7.add(deck[27]);

        wastePile = new Vector<>();

    }

    //TODO determine best logic to find valid move
    public boolean checkValidMove(Card c){
        boolean valid = false;

        for(int i = 0; i < 4; i++){
            if(c.validMoveAce(aces[i].peek())){
                valid = true;
            }
        }
    }


}
