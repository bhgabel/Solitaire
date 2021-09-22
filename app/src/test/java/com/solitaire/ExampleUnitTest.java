package com.solitaire;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*@Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }*/

    @Test
    public void deckConstruction_Test(){
        Deck d = new Deck();
        d.display();
    }

    @Test
    public void deckShuffle_Test(){
        Deck d = new Deck();
        d.display();
        d.shuffle();
        System.out.println();
        d.display();
    }

    @Test
    public void cardBlack_Test(){
        Card c = new Card('C', '2');
        assertEquals(c.isBlack(), true);

        c = new Card('H', 'Q');
        assertEquals(c.isBlack(), false);
    }

    @Test
    public void oneLessRank_Test(){
        Card c1 = new Card('C', '2');
        Card c2 = new Card('H', 'Q');
        assertEquals(c1.oneLessRank(c2), false);

        c2 = new Card('H', '3');
        assertEquals(c1.oneLessRank(c2), true);

        c2 = new Card('H', 'A');
        assertEquals(c1.oneLessRank(c2), false);
    }

    @Test
    public void oneGreaterRank_Test(){
        Card c1 = new Card('C', '2');
        Card c2 = new Card('H', 'Q');
        assertEquals(c1.oneGreaterRank(c2), false);

        c2 = new Card('H', '3');
        assertEquals(c1.oneGreaterRank(c2), false);

        c2 = new Card('H', 'A');
        assertEquals(c1.oneGreaterRank(c2), true);
    }

    @Test
    public void validMove_Test(){
        Card c1 = new Card('C', '2');
        Card c2 = new Card('H', 'Q');
        assertEquals(c1.validMove(c2), false);

        c2 = new Card('H', '3');
        assertEquals(c1.validMove(c2), true);

        c2 = new Card('H', 'A');
        assertEquals(c1.validMove(c2), false);
    }

    @Test
    public void idxCheck(){
        int index = 0;
        for(int i = 0; i < 7; i++){
            for(int idx = 0; i+idx < 7; idx++){
                System.out.print((i+idx) + ":" + index + ", ");
                index++;
            }
        }
    }
}