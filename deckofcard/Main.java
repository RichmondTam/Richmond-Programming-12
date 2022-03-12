package deckofcard;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        //shuffle deck//
        Collections.shuffle(deck.cards);
        ArrayList<Card> deckInHand= new ArrayList<>();
        //draw cards//
        for(int i=0; i<7; i++)
        {
            deckInHand.add(deck.cards.get(i));
        }

        // sort deck by value//
        deckInHand.sort(Card::compareTo);

        System.out.println(deckInHand);









    }


}




