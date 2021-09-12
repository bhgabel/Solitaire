package com.solitaire;

import java.util.ArrayList;
import java.util.Stack;

public class GameField {
    protected Stack<Card> ace1;
    protected Stack<Card> ace2;
    protected Stack<Card> ace3;
    protected Stack<Card> ace4;

    protected ArrayList<Card> col1 = new ArrayList<>();
    protected ArrayList<Card> col2 = new ArrayList<>();
    protected ArrayList<Card> col3 = new ArrayList<>();
    protected ArrayList<Card> col4 = new ArrayList<>();
    protected ArrayList<Card> col5 = new ArrayList<>();
    protected ArrayList<Card> col6 = new ArrayList<>();
    protected ArrayList<Card> col7 = new ArrayList<>();

    public GameField(){

        Deck deck = new Deck();
        deck.shuffle();

        ace1 = new Stack<>();
        ace2 = new Stack<>();
        ace3 = new Stack<>();
        ace4 = new Stack<>();


    }


}
